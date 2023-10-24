public class Passenger {

    private String name;
    private long passportNumber;
    private int age;
    private long phoneNumber;
    private PassengerType passengerType;
    private int luggageAllowance;

    public Passenger(String name, long passportNumber, int age, long phoneNumber, PassengerType passengerType, int luggageAllowance) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.passengerType = passengerType;
        this.luggageAllowance = luggageAllowance;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPassportNumber() {
        return this.passportNumber;
    }

    public void setPassportNumber(long passportNumber) {
        this.passportNumber = passportNumber;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getLuggageAllowance() {
        return this.luggageAllowance;
    }

    public void setLuggageAllowance(int luggageAllowance) {
        this.luggageAllowance = luggageAllowance;
    }

    public void addLuggage(int luggage){
        this.luggageAllowance += luggage;

    }
    public void removeLuggage(int luggage){
        this.luggageAllowance -= luggage;
    }

    public PassengerType getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(PassengerType passengerType) {
        this.passengerType = passengerType;
    }

    public void upgradePassenger(){
        if (this.passengerType== PassengerType.ECONOMY){
            this.setPassengerType(PassengerType.BUSINESS);
        } else if (this.passengerType== PassengerType.BUSINESS){
            this.setPassengerType(PassengerType.FIRST);
        }
    }
    
}
