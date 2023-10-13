package com.pluralsight;
import java.util.Scanner;


public class Library {
    public static void main(String[] args) {
        Book[] books = new Book
    [20];
    Scanner keyboard = new Scanner(System.in);

    books[0]=new
    Book(1,"12345","Naruto",false,"");

    books[1]=new

    Book(2,"12346","One Piece",false,"");

    books[2]=new

    Book(3,"12347","Attack on Titan",false,"");

    books[3]=new

    Book(4,"12348","Berserk",false,"");

    books[4]=new

    Book(5,"12349","Invasion",false,"");

    books[5]=new

    Book(6,"12351","Pokemon",false,"");

    books[6]=new

    Book(7,"12352","Yu-Gi-Oh",false,"");

    books[7]=new

    Book(8,"12353","Treasure Hunter",false,"");

    books[8]=new

    Book(9,"12354","The Bible",false,"");

    books[9]=new

    Book(10,"12355","The Torah",false,"");

    books[10]=new

    Book(11,"12356","The Quran",false,"");

    books[11]=new

    Book(12,"12357","Silo",false,"");

    books[12]=new

    Book(13,"12358","Captain Underpants",false,"");

    books[13]=new

    Book(14,"12359","Cooking with Marijuana",false,"");

    books[14]=new

    Book(15,"12360","The Fantastic Mr.Fox",false,"");

    books[15]=new

    Book(16,"12361","Sakamoto Days",false,"");

    books[16]=new

    Book(17,"12362","After the Rain",false,"");

    books[17]=new

    Book(18,"12363","The Walking Dead",false,"");

    books[18]=new

    Book(19,"12364","Frieren",false,"");

    books[19]=new

    Book(20,"12365","Jujutsu Kaisen?",false,"");


    int choice;
    int checkout;
    int checkOutID = 0;
    int checkOrBack;
    String userName = "";
    int checkOutIDCurrent;
        do

    {
        System.out.println("Please select from the options Below:");
        System.out.println();
        System.out.println("1.) Show Available Books");
        System.out.println("2.) Show Checked Out Books");
        System.out.println("3.) Exit");
        choice = keyboard.nextInt();



        if (choice == 1) {

            for (int i = 0; i < books.length; i++) {

                if (!books[i].getIsCheckedOut()) {
                    System.out.println(books[i].getTitle() + " ID: " + books[i].getId() + " ISBN: " + books[i].getIsbn());
                    System.out.println();


                }


            }

            do {
                System.out.println("Would you like to check out a book?");
                System.out.println("(1) -Yes");
                System.out.println("(2) -No");
                System.out.print("Type 1 or 2: ");
                checkout = keyboard.nextInt();

                if (checkout == 1) {

                    System.out.println("Please enter the ID of the book you wish to check out: ");

                    for (int j = 0; j < books.length; j++) {

                        if (!books[j].getIsCheckedOut()) {
                            System.out.println(books[j].getTitle() + " ID: " + books[j].getId() + " ISBN: " + books[j].getIsbn());


                        }
                    }

                    System.out.print("Enter Book ID: ");
                    checkOutID = keyboard.nextInt();
                    keyboard.nextLine();
                    System.out.print("Please enter your name: ");
                    userName = keyboard.nextLine();

                    for (int k = 0; k < books.length; k++) {
                        if (books[k].getId() == checkOutID) {
                            books[k].checkOut(userName);
                        }

                    }

                } else if (checkout == 2) {

                }
            } while (checkout != 2);


        } else if (choice == 2) {
            System.out.println("Books currently checked out: ");
            for (int l = 0; l < books.length; l++) {
                if (books[l].getIsCheckedOut()) {

                    System.out.println(books[l].getTitle() + " ID: " + books[l].getId() + " ISBN: " + books[l].getIsbn() + "Owner Name: " + books[l].getCheckedOutTo());
                    System.out.println();
                    System.out.println("(1) CHECK IN A BOOK");
                    System.out.println("(2) GO BACK TO HOME SCREEN");
                    checkOrBack = keyboard.nextInt();

                    if (checkOrBack == 1) {
                        System.out.print("Enter the ID of the Book you wish to check in: ");
                        checkOutIDCurrent = keyboard.nextInt();
                        for (int m = 0; m < books.length; m++) {
                            if (books[m].getId() == checkOutIDCurrent) {
                                books[m].checkIn();
                            }

                        }

                    }
                }
            }
        } else if (choice == 3) {
            System.exit(0);
        }


    }while(choice!=3);

}

}