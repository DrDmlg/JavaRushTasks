package com.javarush.task.task19.task1903;

import java.util.HashMap;
import java.util.Map;

/* 
Адаптация нескольких интерфейсов
*/

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
        //countries.forEach((k, v) -> System.out.println(k + ":" + countries.get(k)));

        Contact contact = new IncomeDataAdapter(new IncomeDataImpl());
        System.out.println(contact.getPhoneNumber());

       /* IncomeDataImpl incomeData = new IncomeDataImpl();
        IncomeDataAdapter incomeDataAdapter = new IncomeDataAdapter(incomeData);
        Customer customer = incomeDataAdapter;
        System.out.println(customer.getCountryName());
        System.out.println(customer.getCompanyName());

        */
    }

    public static class IncomeDataImpl implements IncomeData {
        @Override
        public String getCountryCode() {
            return "UA";
        }

        @Override
        public String getCompany() {
            return "JavaRush Ltd.";
        }

        @Override
        public String getContactFirstName() {
            return "Ivan";
        }

        @Override
        public String getContactLastName() {
            return "Ivanov";
        }

        @Override
        public int getCountryPhoneCode() {
            return 38;
        }

        @Override
        public int getPhoneNumber() {
            return 501234567;
        }
    }

    public static class IncomeDataAdapter implements Customer, Contact {

        private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());

        }

        @Override
        public String getName() {
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            String phoneNumber = String.valueOf(data.getPhoneNumber());
            while (phoneNumber.length() < 10) {
                phoneNumber = "0" + phoneNumber;
            }
            String city = phoneNumber.substring(0, 3);
            String part = phoneNumber.substring(3, 6);
            String part1 = phoneNumber.substring(6, 8);
            String part2 = phoneNumber.substring(8);
            return "+" + data.getCountryPhoneCode() + "(" + city + ")" + part + "-" + part1 + "-" + part2;
        }
    }


    public interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example1: 501234567, For example2: 71112233
    }

    public interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example1: +38(050)123-45-67, For example2: +38(007)111-22-33
    }
}