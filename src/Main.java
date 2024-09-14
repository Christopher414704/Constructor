public class Main {
    public static void main(String[] args) {
        correo email = new correoconstructor()
                .addRecipient("destinatario@ejemplo.com")
                .setSubject("Asunto importante")
                .setBody("Este es el cuerpo del correo.")
                .addAttachment("documento.pdf")
                .build();

        System.out.println("Destinatarios: " + email.getRecipiente());
        System.out.println("Asunto: " + email.getSubobjeto());
        System.out.println("Cuerpo: " + email.getCuerpo());
        System.out.println("Adjuntos: " + email.getAttachments());
    }
}