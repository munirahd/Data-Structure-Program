/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproject;

public class Main {

    public static void main(String[] args) {

        java.util.Scanner in = new java.util.Scanner(System.in);

        Cipher cipher = new Cipher();

        int choise2;
        do {

            System.out.println(""
                    + "1. Cryptography\n"
                    + "2. Duplicate word\n"
                    + "3. Recursion\n"
                    + "4. Exit\n");

            System.out.print("Choose the number of the operation you want to perform: ");
            choise2 = in.nextInt();

            switch (choise2) {
                case 1: {

                    int choise;
                    do {
                        System.out.println("1. encoding\n"
                                + "2. decoding\n"
                                + "3. Exit\n");

                        System.out.print("Choose the number of the operation you want to perform: ");
                        choise = in.nextInt();

                        switch (choise) {
                            case 1: {
                                System.out.print("Enter the String you want to encrypts: ");

                                String juck = in.nextLine();
                                String plaintext = in.nextLine();

                                System.out.print("Enter the number do you want the encrypted letter to be far from the original letter: ");
                                int number = in.nextInt();

                                System.out.println("The text after encoding:" + cipher.encoder(plaintext, number));
                            }
                            break;
                            case 2: {

                                System.out.print("Enter the String you want to decrypt: ");

                                String junk = in.nextLine();
                                String cipherText = in.nextLine();

                                System.out.print("Enter the number do you want the decrypt the letter back to it is original letter: ");
                                int number2 = in.nextInt();

                                System.out.println("The text after encoding:" + cipher.decoder(cipherText, number2));
                            }
                            break;
                            case 3: {
                                break;
                            }
                            default: {
                                System.out.println("Wrong choise!! ");
                            }
                        }
                    } while (choise != 3);
                }
                break;
                case 2: {

                    Duplicate obj = new Duplicate();
                    System.out.print("Enter your text:");
                    String junk = in.nextLine();

                    String text = in.nextLine();

                    String[] arr = text.split(" ");
                    for (String arr1 : arr) {
                        obj.push(arr1);
                    }

                    if (obj.checkDuplicate(obj.head)) {
                        System.out.println("\nThere is a duplicate word\n");
                    } else {
                        System.out.println("\nThere is no duplicate word\n");
                    }
                }
                break;
                case 3: {
                    SingleyLinkedList Sll = new SingleyLinkedList();

                    System.out.print("Please Enter the sentance you want to reverse:");
                    String junk = in.nextLine();

                    String sentence = in.nextLine();

                    for (String word : sentence.split(" "))//for each loop to seperate the words and insert it to the LL
                    {
                        Sll.Insert(word);
                    }

                    System.out.println("\n");

                    System.out.println("linked list BEFORE reversing : ");
                    Sll.Print(Sll.head);

                    System.out.println("\n");

                    System.out.println("linked list AFTER reversing : ");
                    Sll.Reverse(Sll.head);
                    System.out.println("\n");
                }
                break;
                case 4: {
                    System.out.println("Thank you , Good bye<3 ");
                }
                break;
                default:
                    System.out.println("Wrong choise !");

            }

        } while (choise2 != 4);

    }
}
