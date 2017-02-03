package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList txtList = new ArrayList();
        Iterator it = txtList.listIterator();

        while(true)
        {

            System.out.println("Would you like to send a new text or view old messages? If neither, please enter EXIT");
            Scanner sc1 = new Scanner(System.in);
            String ans = sc1.nextLine().toLowerCase();
            CharSequence cs1 = "new";
            CharSequence cs2 = "old";

            if (ans.contains(cs1))
            {
                System.out.println("Who would you like to send the text to?");
                Scanner sc = new Scanner(System.in);
                String contact = sc.nextLine();

                System.out.println("Please enter a message");
                Scanner sc2 = new Scanner(System.in);
                String sText = sc2.nextLine();

                Message newText = new Message(contact,sText);
                newText.setSendTime();


                MessageList ms = new MessageList(txtList);
                ms.addTime(newText,txtList);

                txtList.add(newText.getNum());
                txtList.add(newText.getMessage());


            }
            else if (ans.contains(cs2))
            {
                if (txtList.size() == 0)
                {
                    System.out.println("You do not have any messages");
                    break;
                }
                System.out.println("Time Sent: " + txtList.get(0));
                System.out.println("Receiver: " + txtList.get(1));
                System.out.println("Message: " + txtList.get(2));

                System.out.println("Would you like to delete this message?");
                Scanner sc3 = new Scanner(System.in);
                String yn = sc3.nextLine();
                if (yn.contains("yes"))
                {
                    txtList.clear();
                    System.out.println("Your messages have been deleted.");
                }

            }
        }











    }
}
