package org.salmontt.model.person;

/**
 * Address Class
 */
public class Address {
    private Region region;
    private String street;
    private String number;
    private String dept;
    private String villa;


    /**
     * Constructor for simple house
     * @param region    Region enum
     * @param street    String to represent street name
     * @param number    String to represent house number
     */
    public Address(Region region, String street, String number) {
        this.region = region;
        this.street = street;
        this.number = number;
    }
    /**
     * Constructor for simple appartment
     * @param region    Region enum
     * @param street    String to represent street name
     * @param number    String to represent house number
     * @param dept      String to represent appartment number
     */
    public Address(Region region, String street, String number, String dept) {
        this.region = region;
        this.street = street;
        this.number = number;
        this.dept = dept;
    }
    /**
     * Constructor for simple appartment in villa
     * @param region    Region enum
     * @param street    String to represent street name
     * @param number    String to represent house number
     * @param dept      String to represent appartment number
     * @param villa     String to represent villa name
     */
    public Address(Region region, String street, String number, String dept, String villa) {
        this.region = region;
        this.street = street;
        this.number = number;
        this.dept = dept;
        this.villa = villa;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getVilla() {
        return villa;
    }

    public void setVilla(String villa) {
        this.villa = villa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Región=").append(region);
        sb.append(", Calle='").append(street).append('\'');
        sb.append(", Numero='").append(number).append('\'');
        if (dept != null){
            sb.append(", dept='").append(dept).append('\'');
        }
        if (villa != null){
            sb.append(", villa='").append(villa).append('\'');
        }
        return sb.toString();
    }
}
