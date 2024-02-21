class Contact {
    private String firstName;
    private String lastName;
    private String phoneNo;



    //Constructor
    public Contact(String firstName, String lastName, String phoneNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
    }



    //getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }



    //toString() Method
    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }



}

