package bai_lam_them_2.service.impl;

import bai_lam_them_2.model.*;

import bai_lam_them_2.service.TransportationService;
import bai_lam_them_2.util.read_and_write.ReadAndWriteForBike;
import bai_lam_them_2.util.read_and_write.ReadAndWriteForCar;
import bai_lam_them_2.util.read_and_write.ReadAndWriteForTruck;
import bai_lam_them_2.util.read_and_write.ReadManufacturerFile;
import bai_lam_them_2.util.exception.NotFoundVehicleException;
import bai_lam_them_2.util.regex.Regex;

import java.util.List;
import java.util.Scanner;

public class TransportationServiceImpl implements TransportationService {
    private static final String CAR_PATH = "src\\bai_lam_them_2\\data\\oTo.csv";
    private static final String TRUCK_PATH = "src\\bai_lam_them_2\\data\\xeTai.csv";
    private static final String BIKE_PATH = "src\\bai_lam_them_2\\data\\xeMay.csv";
    private static final String MANUFACTURER_PATH = "src\\bai_lam_them_2\\data\\hangSanXuat.csv";
    Regex regex = new Regex();

    @Override
    public void add() {
        List<Manufacturer> manufacturerList = ReadManufacturerFile.readManufacturerList(MANUFACTURER_PATH);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("1. Thêm xe tải");
                System.out.println("2. Thêm ô tô");
                System.out.println("3. Thêm xe máy");
                System.out.println("4. Quay lại menu chính");
                System.out.print("Bạn muốn chọn gì: ");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        List<Truck> truckList = ReadAndWriteForTruck.readTruckList(TRUCK_PATH);

                        String licensePlateForTruck;
                        boolean isValidOfLicensePlateForTruck;
                        do {
                            System.out.print("Hãy nhập biển kiểm soát: ");
                            licensePlateForTruck = scanner.nextLine();
                            isValidOfLicensePlateForTruck = regex.validateOfTruck(licensePlateForTruck);
                            if (!isValidOfLicensePlateForTruck) {
                                System.out.println("Lỗi. Biển kiểm soát phải đúng định dạng");
                            }
                        } while (!isValidOfLicensePlateForTruck);

                        String manufacturerForTruck;
                        while (true) {
                            try {
                                for (int i = 0; i < manufacturerList.size(); i++) {
                                    System.out.println((i + 1) + ". " + manufacturerList.get(i).toString());
                                }
                                System.out.print("Hãy chọn số: ");
                                int chooseManufacturerForTruck = Integer.parseInt(scanner.nextLine());
                                if (chooseManufacturerForTruck > manufacturerList.size() || chooseManufacturerForTruck <= 0) {
                                    throw new Exception("Lỗi. Hãy nhập lại.");
                                }
                                manufacturerForTruck = manufacturerList.get(chooseManufacturerForTruck - 1).getManufacturer();
                                System.out.println("Bạn đã chọn: " + manufacturerForTruck);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println(e.getMessage());
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        int yearOfManufactureForTruck;
                        while (true) {
                            try {
                                System.out.print("Hãy nhập năm sản xuất: ");
                                yearOfManufactureForTruck = Integer.parseInt(scanner.nextLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        String ownerForTruck;
                        boolean isValidOfOwnerForTruck;
                        do {
                            System.out.print("Hãy nhập chủ sỡ hữu: ");
                            ownerForTruck = scanner.nextLine();
                            isValidOfOwnerForTruck = regex.validateOfOwner(ownerForTruck);
                            if (!isValidOfOwnerForTruck) {
                                System.out.println("Lỗi. Hãy nhập lại.");
                            }
                        } while (!isValidOfOwnerForTruck);

                        double tonnageForTruck;
                        while (true) {
                            try {
                                System.out.print("Hãy nhập trọng tải: ");
                                tonnageForTruck = Double.parseDouble(scanner.nextLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        Truck truck = new Truck(licensePlateForTruck, manufacturerForTruck, yearOfManufactureForTruck, ownerForTruck, tonnageForTruck);
                        truckList.add(truck);
                        ReadAndWriteForTruck.writeTruckList(truckList, TRUCK_PATH, false);
                        break;
                    case 2:
                        List<Car> carList = ReadAndWriteForCar.readCarList(CAR_PATH);

                        String licensePlateForCar;
                        boolean isValidOfLicensePlateForCar;
                        do {
                            System.out.print("Hãy nhập biển kiểm soát: ");
                            licensePlateForCar = scanner.nextLine();
                            isValidOfLicensePlateForCar = regex.validateOfCar(licensePlateForCar);
                            if (!isValidOfLicensePlateForCar) {
                                System.out.println("Lỗi. Biển kiểm soát phải đúng định dạng");
                            }
                        } while (!isValidOfLicensePlateForCar);

                        String manufacturerForCar;
                        while (true) {
                            try {
                                for (int i = 0; i < manufacturerList.size(); i++) {
                                    System.out.println((i + 1) + ". " + manufacturerList.get(i).toString());
                                }
                                System.out.print("Hãy chọn số: ");
                                int chooseManufacturerForCar = Integer.parseInt(scanner.nextLine());
                                if (chooseManufacturerForCar > manufacturerList.size() || chooseManufacturerForCar <= 0) {
                                    throw new Exception("Lỗi. Hãy nhập lại.");
                                }
                                manufacturerForCar = manufacturerList.get(chooseManufacturerForCar - 1).getManufacturer();
                                System.out.println("Bạn đã chọn: " + manufacturerForCar);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println(e.getMessage());
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }


                        int yearOfManufactureForCar;
                        while (true) {
                            try {
                                System.out.print("Hãy nhập năm sản xuất: ");
                                yearOfManufactureForCar = Integer.parseInt(scanner.nextLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        String ownerForCar;
                        boolean isValidOfOwnerForCar;
                        do {
                            System.out.print("Hãy nhập chủ sỡ hữu: ");
                            ownerForCar = scanner.nextLine();
                            isValidOfOwnerForCar = regex.validateOfOwner(ownerForCar);
                            if (!isValidOfOwnerForCar) {
                                System.out.println("Lỗi. Hãy nhập lại.");
                            }
                        } while (!isValidOfOwnerForCar);

                        int numberOfSeatsForCar;
                        while (true) {
                            try {
                                System.out.print("Hãy nhập số chỗ ngồi: ");
                                numberOfSeatsForCar = Integer.parseInt(scanner.nextLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        String vehicleOfTypeForCar;
                        while (true) {
                            try {
                                String[] arrayOfVehicleOfType = {"Xe du lịch", "Xe khách"};
                                for (int i = 0; i < arrayOfVehicleOfType.length; i++) {
                                    System.out.println((i + 1) + ". " + arrayOfVehicleOfType[i]);
                                }
                                System.out.print("Hãy chọn số: ");
                                int chooseVehicleOfTypeForCar = Integer.parseInt(scanner.nextLine());
                                if (chooseVehicleOfTypeForCar > arrayOfVehicleOfType.length || chooseVehicleOfTypeForCar <= 0) {
                                    throw new Exception("Lỗi. Hãy nhập lại.");
                                }
                                vehicleOfTypeForCar = arrayOfVehicleOfType[chooseVehicleOfTypeForCar - 1];
                                System.out.println("Bạn đã chọn: " + vehicleOfTypeForCar);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println(e.getMessage());
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        Car car = new Car(licensePlateForCar, manufacturerForCar, yearOfManufactureForCar, ownerForCar, numberOfSeatsForCar, vehicleOfTypeForCar);
                        carList.add(car);
                        ReadAndWriteForCar.writeCarList(carList, CAR_PATH, false);
                        break;
                    case 3:
                        List<Bike> bikeList = ReadAndWriteForBike.readBikeList(BIKE_PATH);

                        String licensePlateForBike;
                        boolean isValidOfLicensePlateForBike;
                        do {
                            System.out.print("Hãy nhập biển kiểm soát: ");
                            licensePlateForBike = scanner.nextLine();
                            isValidOfLicensePlateForBike = regex.validateOfBike(licensePlateForBike);
                            if (!isValidOfLicensePlateForBike) {
                                System.out.println("Lỗi. Biển kiểm soát phải đúng định dạng");
                            }
                        } while (!isValidOfLicensePlateForBike);

                        String manufacturerForBike;
                        while (true) {
                            try {
                                for (int i = 0; i < manufacturerList.size(); i++) {
                                    System.out.println((i + 1) + ". " + manufacturerList.get(i).toString());
                                }
                                System.out.print("Hãy chọn số: ");
                                int chooseManufacturerForBike = Integer.parseInt(scanner.nextLine());
                                if (chooseManufacturerForBike > manufacturerList.size()) {
                                    throw new Exception("Lỗi. Hãy nhập lại.");
                                }
                                manufacturerForBike = manufacturerList.get(chooseManufacturerForBike - 1).getManufacturer();
                                System.out.println("Bạn đã chọn: " + manufacturerForBike);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println(e.getMessage());
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        int yearOfManufactureForBike;
                        while (true) {
                            try {
                                System.out.print("Hãy nhập năm sản xuất: ");
                                yearOfManufactureForBike = Integer.parseInt(scanner.nextLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        String ownerForBike;
                        boolean isValidOfOwnerForBike;
                        do {
                            System.out.print("Hãy nhập chủ sỡ hữu: ");
                            ownerForBike = scanner.nextLine();
                            isValidOfOwnerForBike = regex.validateOfOwner(ownerForBike);
                            if (!isValidOfOwnerForBike) {
                                System.out.println("Lỗi. Hãy nhập lại.");
                            }
                        } while (!isValidOfOwnerForBike);

                        int wattageForBike;
                        while (true) {
                            try {
                                System.out.print("Hãy nhập công suất: ");
                                wattageForBike = Integer.parseInt(scanner.nextLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        Bike bike = new Bike(licensePlateForBike, manufacturerForBike, yearOfManufactureForBike, ownerForBike, wattageForBike);
                        bikeList.add(bike);
                        ReadAndWriteForBike.writeBikeList(bikeList, BIKE_PATH, false);
                        break;
                    case 4:
                        break;
                    default:
                        throw new Exception("Lỗi. Hãy nhập lại.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void display() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("1. Hiển thị xe tải");
                System.out.println("2. Hiển thị ô tô");
                System.out.println("3. Hiển thị xe máy");
                System.out.println("4. Quay lại menu chính");
                System.out.print("Bạn muốn chọn gì: ");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        List<Truck> truckList = ReadAndWriteForTruck.readTruckList(TRUCK_PATH);
                        for (Truck truck : truckList) {
                            System.out.println(truck.toString());
                        }
                        break;
                    case 2:
                        List<Car> carList = ReadAndWriteForCar.readCarList(CAR_PATH);
                        for (Car car : carList) {
                            System.out.println(car.toString());
                        }
                        break;
                    case 3:
                        List<Bike> bikeList = ReadAndWriteForBike.readBikeList(BIKE_PATH);
                        for (Bike bike : bikeList) {
                            System.out.println(bike.toString());
                        }
                        break;
                    case 4:
                        break;
                    default:
                        throw new Exception("Lỗi. Hãy nhập lại.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                List<Truck> truckList = ReadAndWriteForTruck.readTruckList(TRUCK_PATH);
                List<Car> carList = ReadAndWriteForCar.readCarList(CAR_PATH);
                List<Bike> bikeList = ReadAndWriteForBike.readBikeList(BIKE_PATH);
                String licensePlateForDelete;
                boolean isValidOfLicensePlateForDelete;
                do {
                    System.out.print("Hãy nhập vào biển kiểm soát cần xóa: ");
                    licensePlateForDelete = scanner.nextLine();
                    isValidOfLicensePlateForDelete = regex.validateOfTruck(licensePlateForDelete) || regex.validateOfCar(licensePlateForDelete) || regex.validateOfBike(licensePlateForDelete);
                    if (!isValidOfLicensePlateForDelete) {
                        System.out.println("Lỗi. Biển kiểm soát phải đúng định dạng.");
                    }
                } while (!isValidOfLicensePlateForDelete);
                boolean check = false;
                for (Truck truck : truckList) {
                    if (truck.getLicensePlate().equals(licensePlateForDelete)) {
                        while (true) {
                            try {
                                check = true;
                                System.out.println("1. Yes");
                                System.out.println("2. No");
                                System.out.print("Hãy chọn số: ");
                                int chooseForTruck = Integer.parseInt(scanner.nextLine());
                                switch (chooseForTruck) {
                                    case 1:
                                        truckList.remove(truck);
                                        ReadAndWriteForTruck.writeTruckList(truckList, TRUCK_PATH, false);
                                        System.out.println("Đã xóa thành công");
                                        break;
                                    case 2:
                                        break;
                                    default:
                                        throw new Exception("Lỗi. Hãy nhập lại.");
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println(e.getMessage());
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        break;
                    }
                }
                for (Car car : carList) {
                    if (car.getLicensePlate().equals(licensePlateForDelete)) {
                        while (true) {
                            try {
                                check = true;
                                System.out.println("1. Yes");
                                System.out.println("2. No");
                                System.out.print("Hãy chọn số: ");
                                int chooseForCar = Integer.parseInt(scanner.nextLine());
                                switch (chooseForCar) {
                                    case 1:
                                        carList.remove(car);
                                        ReadAndWriteForCar.writeCarList(carList, CAR_PATH, false);
                                        System.out.println("Đã xóa thành công");
                                        break;
                                    case 2:
                                        break;
                                    default:
                                        throw new Exception("Lỗi. Hãy nhập lại.");
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println(e.getMessage());
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        break;
                    }
                }
                for (Bike bike : bikeList) {
                    if (bike.getLicensePlate().equals(licensePlateForDelete)) {
                        while (true) {
                            try {
                                check = true;
                                System.out.println("1. Yes");
                                System.out.println("2. No");
                                System.out.print("Hãy chọn số: ");
                                int chooseForBike = Integer.parseInt(scanner.nextLine());
                                switch (chooseForBike) {
                                    case 1:
                                        bikeList.remove(bike);
                                        ReadAndWriteForBike.writeBikeList(bikeList, BIKE_PATH, false);
                                        System.out.println("Đã xóa thành công");
                                        break;
                                    case 2:
                                        break;
                                    default:
                                        throw new Exception("Lỗi. Hãy nhập lại.");
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println(e.getMessage());
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        break;
                    }
                }
                if (!check) {
                    throw new NotFoundVehicleException("Biển kiểm soát không tồn tại.");
                }
                break;
            } catch (NotFoundVehicleException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
