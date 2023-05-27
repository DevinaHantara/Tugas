import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class TUGAS12 {
    static ArrayList<Patient> patients = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choose;
        do {
            System.out.println("Patient's Data");
            System.out.println("++++++++++++++");
            System.out.println("1. Input New Data");
            System.out.println("2. View Patient's Data");
            System.out.println("3. Exit");
            System.out.println("Choose :");
            choose = scanner.nextInt();
            scanner.nextLine();

            switch (choose) {
                case 1:
                    System.out.println("Option 1 selected");
                    while (true) {
                        System.out.println("Input Name [3..20]: ");
                        String Name = scanner.nextLine();
                        if (Name.length() >= 3 && Name.length() <= 20) {
                            break;
                        } else {
                            continue;
                        }
                    }
                    int age = 0;
                    boolean isValid = false;

                    while (!isValid) {
                        System.out.print("Input Age [10..100]: ");
                        String input = scanner.nextLine();

                        try {
                            age = Integer.parseInt(input);
                            if (age >= 10 && age <= 100) {
                                isValid = true;
                            } else {
                                System.out.println("Age must be between 10 and 100.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Input must be numeric!");
                        }
                    }
                    while (true) {
                        System.out.println("Input Address [5..30]: ");
                        String Address = scanner.nextLine();
                        if (Address.length() >= 5 && Address.length() <= 30) {
                            break;
                        } else {
                            continue;
                        }
                    }
                    System.out.println("Data has been successfully inserted!");
                    break;

                case 2:
                    System.out.println("Option 2 selected");
                    static void viewPatientsData; (Scanner) {
                    System.out.println("\n=== View Patient's Data ===");
                    if (patients.isEmpty()) {
                        System.out.println("No Data!");
                        return;
                    }

                    System.out.println("No\tName\tAge\tAddress");
                    for (int i = 0; i < patients.size(); i++) {
                        Patient patient = patients.get(i);
                        System.out.println((i + 1) + "\t" + patient.Name() + "\t" + patient.Age() + "\t" + patient.Address());
                    }

                    displaySortMenu();
                    int choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            sortDataByNameAscending();
                            break;
                        case 2:
                            sortDataByNameDescending();
                            break;
                        case 3:
                            sortDataByAgeAscending();
                            break;
                        case 4:
                            sortDataByAgeDescending();
                            break;
                        case 5:
                            // Back to main menu
                            break;
                        default:
                            System.out.println("Invalid choice. Returning to main menu.");
                    }
                }

                static void displaySortMenu() {
                    System.out.println("\nSort Data:");
                    System.out.println("1. Sort Data by Name Ascending");
                    System.out.println("2. Sort Data by Name Descending");
                    System.out.println("3. Sort Data by Age Ascending");
                    System.out.println("4. Sort Data by Age Descending");
                    System.out.println("5. Back");
                    System.out.print("Enter your choice: ");
                }

                static void sortDataByNameAscending() {
                    Collections.sort(patients, Comparator.comparing(Patient::Name));
                    System.out.println("Data sorted by name (ascending) successfully!");
                }

                static void sortDataByNameDescending() {
                    Collections.sort(patients, Comparator.comparing(Patient::Name).reversed());
                    System.out.println("Data sorted by name (descending) successfully!");
                }

                static void sortDataByAgeAscending() {
                    Collections.sort(patients, Comparator.comparingInt(Patient::Age));
                    System.out.println("Data sorted by age (ascending) successfully!");
                }

                static void sortDataByAgeDescending() {
                    Collections.sort(patients, Comparator.comparingInt(Patient::Age).reversed());
                    System.out.println("Data sorted by age (descending) successfully!");
                }

                static boolean validateData(String Name, int age, String Address) {
                    return Name.length() >= 3 && Name.length() <= 20 &&
                            age >= 10 && age <= 100 &&
                            Address.length() >= 5 && Address.length() <= 30;
                }
            }

            class Patient {
                private String name;
                private int age;
                private String address;

                public Patient(String name, int age, String address) {
                    this.name = name;
                    this.age = age;
                    this.address = address;
                }

                public String getName() {
                    return name;
                }

                public int getAge() {
                    return age;
                }

                public String getAddress() {
                    return address;
                }
                    break;

                case 3:
                    System.out.println("Exit selected");
                    System.exit(3);
                    break;
                default:
                    System.out.println("Invalid selection");
                    break;
            }
        } while (choose == 1 || choose == 2 || choose == 3);
    }

    private static class Patient {
    }
}


