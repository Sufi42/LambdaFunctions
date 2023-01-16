package com.bl.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Phone {
        int id;
        String brand;
        String model;
        Float price;

        @Override
        public String toString() {
            return "Phone{" + "id=" + id + ", brand='" + brand + '\'' + ", model='" + model + '\'' + ", price=" + price
                    + '}';
        }

        public Phone(int id, String brand, String model, Float price) {
            this.id = id;
            this.brand = brand;
            this.model = model;
            this.price = price;

        }

        public static void main(String[] args) {
            List<Phone> phoneList = new ArrayList<Phone>();
            phoneList.add(new Phone(1, "Apple", "Iphone13", 1223.50f));
            phoneList.add(new Phone(2, "Samsung", "s9", 29000.00f));
            phoneList.add(new Phone(3, "Readme", "10Pro", 39000.00f));
            phoneList.add(new Phone(4, "oppo", "Reno 8", 25000.00f));

            List<Phone> list2 = phoneList.stream().filter(p -> p.price > 25000).map(p -> p).collect(Collectors.toList());
            System.out.println(list2);

            Map<Integer, String> phoneMap = phoneList.stream().collect(Collectors.toMap(p -> p.id, p -> p.model));
            System.out.println(phoneMap);

            Map<Integer, String> phoneMap2 = phoneList.stream().collect(Collectors.toMap(p -> p.id, p -> p.brand));
            System.out.println(phoneMap2);

            List<Float> list3 = phoneList.stream().filter(p -> p.price > 25000).map(p -> p.price)
                    .collect(Collectors.toList());
            System.out.println(list3);

        }
    }

