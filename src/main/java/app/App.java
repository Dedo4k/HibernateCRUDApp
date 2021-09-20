package app;

import app.model.City;
import app.model.Student;
import app.service.CityService;
import app.service.StudentService;
import app.util.IOUtil;
import app.util.MenuUtil;

public class App {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        CityService cityService = new CityService();

        boolean flag = true;

        while (flag) {
            MenuUtil.mainMenu();
            int choice = IOUtil.getInteger();
            switch (choice) {
                case 1: {
                    for (Object obj : studentService.getAll()) {
                        System.out.println(obj);
                    }
                    break;
                }
                case 2: {
                    MenuUtil.studentIdMenu();
                    int id = IOUtil.getInteger();
                    System.out.println(studentService.getById((long) id));
                    break;
                }
                case 3: {
                    for (Object obj : cityService.getAll()) {
                        System.out.println(obj);
                    }
                    break;
                }
                case 4: {
                    MenuUtil.cityIdMenu();
                    int id = IOUtil.getInteger();
                    System.out.println(cityService.getById((long) id));
                    break;
                }
                case 5: {
                    MenuUtil.firstNameMenu();
                    String firstName = IOUtil.getString();
                    MenuUtil.lastNameMenu();
                    String lastName = IOUtil.getString();
                    MenuUtil.contactMenu();
                    String contact = IOUtil.getString();
                    Student student = new Student();
                    student.setFirstName(firstName);
                    student.setLastName(lastName);
                    student.setContactNo(contact);
                    MenuUtil.cityMenu();
                    for (Object obj : cityService.getAll()) {
                        System.out.println(obj);
                    }
                    int cityId = IOUtil.getInteger();
                    City city = cityService.getById((long) cityId);
                    student.setCity(city);
                    studentService.create(student);
                    break;
                }
                case 6: {
                    MenuUtil.studentIdMenu();
                    int id = IOUtil.getInteger();
                    Student student = studentService.getById((long) id);
                    MenuUtil.firstNameMenu();
                    String firstName = IOUtil.getString();
                    MenuUtil.lastNameMenu();
                    String lastName = IOUtil.getString();
                    MenuUtil.contactMenu();
                    String contact = IOUtil.getString();
                    student.setLastName(lastName);
                    student.setContactNo(contact);
                    student.setFirstName(firstName);
                    MenuUtil.cityMenu();
                    for (Object obj : cityService.getAll()) {
                        System.out.println(obj);
                    }
                    int cityId = IOUtil.getInteger();
                    City city = cityService.getById((long) cityId);
                    student.setCity(city);
                    studentService.updateById((long) id, student);
                    break;
                }
                case 7: {
                    MenuUtil.studentIdMenu();
                    int id = IOUtil.getInteger();
                    studentService.deleteById((long) id);
                    break;
                }
                case 8: {
                    MenuUtil.cityNameMenu();
                    String name = IOUtil.getString();
                    City city = new City();
                    city.setName(name);
                    cityService.create(city);
                    break;
                }
                case 9: {
                    MenuUtil.cityIdMenu();
                    int id = IOUtil.getInteger();
                    City city = cityService.getById((long) id);
                    MenuUtil.cityNameMenu();
                    String name = IOUtil.getString();
                    city.setName(name);
                    cityService.update(city);
                    break;
                }
                case 10: {
                    MenuUtil.cityIdMenu();
                    int id = IOUtil.getInteger();
                    cityService.deleteById((long) id);
                    break;
                }
                case 11: {
                    flag = false;
                    break;
                }
            }
        }
    }
}
