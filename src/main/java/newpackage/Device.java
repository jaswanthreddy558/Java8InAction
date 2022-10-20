package newpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import jdk.nashorn.internal.parser.JSONParser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Device {
    private int id;
    private String name;
    private long pin;
    private Date date;

    public Device(int id, String name, long pin, Date date) {
        this.id = id;
        this.name = name;
        this.pin = pin;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPin() {
        return pin;
    }

    public void setPin(long pin) {
        this.pin = pin;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pin=" + pin +
                ", date=" + date +
                '}';
    }
}

class Test {
    public static void main(String[] args) throws ParseException {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Jaswanth", 1);

        System.out.println(months(map1));
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss.SSS");
        Device d1 = new Device(1, "Samsung", 934195, format.parse("15-10-2022 02:18:53.909"));
        Device d2 = new Device(4, "Moto", 129876, format.parse("15-10-2022 02:40:11.149"));
        Device d3 = new Device(5, "Moto", 671598, format.parse("15-10-2022 02:55:01.879"));
        Device d4 = new Device(6, "Moto", 305483, format.parse("15-10-2022 03:15:01.879"));
        Device d5 = new Device(7, "Moto", 190352, format.parse("15-10-2022 03:16:11.109"));
        Device d6 = new Device(8, "Sony", 278160, format.parse("15-10-2022 03:30:12.809"));

        List<Device> sortedListOfMotoDevice = Arrays.asList(d1, d2, d3, d4, d5, d6).stream().filter(x -> x.getName().equals("Moto") || x.getName().equals("Samsung"))
                .sorted(Comparator.comparing(Device::getDate)).collect(Collectors.toList());
        System.out.println(sortedListOfMotoDevice);


    }

    public static Integer months(Map<String, Integer> map) {


        Map<String, Integer> monthDays = new HashMap<>();

        monthDays.put("March", 31);
        monthDays.put("April", 30);

        Set<Map.Entry<String, Integer>> entrySet = monthDays.entrySet();
        return entrySet.stream().filter(pair -> map.equals(pair.getKey())).map(Map.Entry::getValue).findAny().orElse(null);


    }
}


class Root {

    private List<Student> students;

}

class Student {

    private String fullName;
    private int standard;
    private Set<String> hobbies;


    public static void main(String[] args) throws JsonProcessingException {


    }
}



