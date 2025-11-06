package unidad4.lamiga;

import java.util.Objects;

/**
 * Represents a customer placing an order at La Miga.
 */
public final class Customer {
    private final String name;
    private final String phoneNumber;

    public Customer(String name, String phoneNumber) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("El nombre del cliente es obligatorio");
        }
        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("El teléfono del cliente es obligatorio");
        }
        this.name = name.trim();
        this.phoneNumber = phoneNumber.trim();
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Customer other = (Customer) obj;
        return Objects.equals(name, other.name) && Objects.equals(phoneNumber, other.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber);
    }

    @Override
    public String toString() {
        return name + " (" + phoneNumber + ")";
    }
}
