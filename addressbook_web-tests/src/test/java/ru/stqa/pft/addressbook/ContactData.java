package ru.stqa.pft.addressbook;

public class ContactData {
    private final String firstname;
    private final String middlename;
    private final String lastname;
    private final String nickname;
    private final String company;
    private final String title;
    private final String bday;
    private final String bmonth;
    private final String byear;
    private final String address2;

    public ContactData(String firstname, String middlename, String lastname, String nickname, String company, String title, String bday, String bmonth, String byear, String address2) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.nickname = nickname;
        this.company = company;
        this.title = title;
        this.bday = bday;
        this.bmonth = bmonth;
        this.byear = byear;
        this.address2 = address2;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getCompany() {
        return company;
    }

    public String getTitle() {
        return title;
    }

    public String getBday() {
        return bday;
    }

    public String getBmonth() {
        return bmonth;
    }

    public String getByear() {
        return byear;
    }

    public String getAddress2() {
        return address2;
    }
}
