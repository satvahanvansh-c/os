import java.io.*;

import java.util.Calendar;

import java.util.Date;


class Donor implements Serializable {

    String name,addr,conNo,blg;

    int age;

    Date lddate;

    public Donor(String name,int age,String addr,String conNo,String blg, Date lddate) 

    {

        this.name = name;

        this.age = age;

        this.addr = addr;

        this.conNo = conNo;

        this.blg = blg;

        this.lddate = lddate;

    }

    public String getBloodGroup() {

        return blg;

    }


    public Date getDateOfLastDonation() {

        return lddate;

    }


    public void display() {

        System.out.println("Name: " + name);

        System.out.println("Age: " + age);

        System.out.println("Address: " + addr);

        System.out.println("Contact Number: " + conNo);

        System.out.println("Blood Group: " + blg);

        System.out.println("Date of Last Donation: " + lddate);

        System.out.println();

    }

    public boolean isEligibleForDonation() {

        Calendar currentDate = Calendar.getInstance();

        Calendar donationDate = Calendar.getInstance();

        donationDate.setTime(lddate);

        donationDate.add(Calendar.MONTH, 6); // Add 6 months to the last donation date

        return currentDate.after(donationDate);

    }


    public static void writeDonorsToFile(Donor[] donors, String fileName) throws IOException {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {

            // Writing each donor object individually

            for (Donor donor : donors) {

                oos.writeObject(donor);

            }

        }

    }


    public static Donor readDonorFromFile(ObjectInputStream ois) throws IOException, ClassNotFoundException {

        return (Donor) ois.readObject();

    }

    public static Date createDate(int year, int month, int day) 

    {

        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.YEAR, year);

        cal.set(Calendar.MONTH, month - 1); // Months are 0-based in Calendar

        cal.set(Calendar.DAY_OF_MONTH, day);

        return cal.getTime();

    }

}

class Slip26_2

{

public static void main(String[] args) {

        Donor[] donors = new Donor[5];

        donors[0] = new Donor("John Doe", 35, "123 Main St", "9876543210", "A+ve", Donor.createDate(2022, 1, 15));

        donors[1] = new Donor("Jane Smith", 28, "456 Elm St", "9876543211", "B+ve", Donor.createDate(2023, 3, 10));

        donors[2] = new Donor("Mike Johnson", 45, "789 Oak St", "9876543212", "A+ve", Donor.createDate(2021, 12, 1));

        donors[3] = new Donor("Emily Davis", 40, "101 Pine St", "9876543213", "O+ve", Donor.createDate(2023, 2, 20));

        donors[4] = new Donor("Chris Brown", 38, "202 Maple St", "9876543214", "A+ve", Donor.createDate(2023, 5, 18));

        String fileName = "donors.dat";

        try {

            Donor.writeDonorsToFile(donors, fileName);

            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {

                System.out.println("Donors with blood group A+ve who have not donated in the last 6 months:");

                for (int i = 0; i < donors.length; i++) {

                    Donor donor = Donor.readDonorFromFile(ois);

                    if (donor.getBloodGroup().equals("A+ve") && donor.isEligibleForDonation()) {

                        donor.display();

                    }

                }

            }


        } catch (IOException | ClassNotFoundException e) {

            e.printStackTrace();

        }

    }

}
