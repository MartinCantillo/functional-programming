package dtos;

public class PersonDto {
    private String name;
    private String email;

    // Constructor
    public PersonDto(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // Optional: toString for better print representation
    @Override
    public String toString() {
        return "PersonDto{name='" + name + "', email='" + email + "'}";
    }
}
