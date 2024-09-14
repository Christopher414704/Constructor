import java.util.ArrayList;
import java.util.List;

    public class correoconstructor {
        private List<String> recipiente = new ArrayList<>();
        private String subobjeto;
        private String cuerpo;
        private List<String> attachments = new ArrayList<>();

        public correoconstructor addRecipient(String recipient) {
            this.recipiente.add(recipient);
            return this;
        }

        public correoconstructor setSubject(String subject) {
            this.subobjeto = subject;
            return this;
        }

        public correoconstructor setBody(String body) {
            this.cuerpo = body;
            return this;
        }

        public correoconstructor addAttachment(String attachment) {
            this.attachments.add(attachment);
            return this;
        }

        public correo build() {
            if (recipiente.isEmpty()) {
                throw new IllegalStateException("El email debe tener al menos un destinatario.");
            }
            if (subobjeto == null || subobjeto.isEmpty()) {
                throw new IllegalStateException("El email debe tener un asunto.");
            }
            if (cuerpo == null || cuerpo.isEmpty()) {
                throw new IllegalStateException("El email debe tener un cuerpo.");
            }
            return new correo(this);
        }

        List<String> getRecipients() {
            return recipiente;
        }

        String getSubject() {
            return subobjeto;
        }

        String getBody() {
            return cuerpo;
        }

        List<String> getAttachments() {
            return attachments;
        }

    }

