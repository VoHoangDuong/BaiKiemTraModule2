package com.phonebook.model;

public class PhoneBook {
    private String phoneNumber;
    private String groupName;
    private String name;
    private String gender;
    private String address;
    private String dateOfBirth;
    private String email;

    public PhoneBook(String phoneNumber, String group, String name, String gender, String address, String dateOfBirth, String email) {
        this.phoneNumber = phoneNumber;
        this.groupName = group;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public PhoneBook(){

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof PhoneBook){
            PhoneBook phoneBook = (PhoneBook) o;
            if (phoneBook.getPhoneNumber().equals(this.phoneNumber)){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Th??ng tin: " + "| S??? ??i???n tho???i: " + String.format("%-12s|",phoneNumber) + " Nh??m c???a danh b???: " + String.format("%-10s |", groupName) + " T??n: " + String.format("%-10s|",name) + " Gi???i t??nh: " + String.format("%-10s|",gender) + " ?????a ch???: " + String.format("%-10s|",address)  + " Ng??y sinh: " + String.format("%-10s |",dateOfBirth) + " Email: " + String.format("%-10s |",email);
    }

    public String toStringCSV(){
        return phoneNumber+","+ groupName +","+name+","+gender+","+address+","+dateOfBirth+","+email+"\n";
    }

    public String toStringInfo(){
        return "Th??ng tin: | " + " S??? ??i???n tho???i: " + String.format("%-12s|",phoneNumber) + " Nh??m c???a danh b???: " + String.format("%-10s|", groupName) + " T??n: " + String.format("%-10s|",name) + " Gi???i t??nh: " + String.format("%-6s|",gender) + " ?????a ch???: " + String.format("%-10s|",address)  + " Ng??y sinh: " + String.format("%-10s|",dateOfBirth);
    }
}
