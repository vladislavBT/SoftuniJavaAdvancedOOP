package DesignPattens;

public class Main {
    public static void main(String[] args) {

        Address address = Address.builder()
                .withCity("Sofia")
                .withEmail("mincho@gmail.com")
                .withRecipientName("Mincho")
                .build();
    }
}
