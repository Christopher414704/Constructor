import java.util.Collections;
import java.util.List;

    public class correo {
        private final List<String> recipiente;
        private final String subobjeto;
        private final String cuerpo;
        private final List<String> attachments;

        correo(correoconstructor builder) {
            this.recipiente = Collections.unmodifiableList(builder.getRecipients());
            this.subobjeto = builder.getSubject();
            this.cuerpo = builder.getBody();
            this.attachments = Collections.unmodifiableList(builder.getAttachments());
        }

        public List<String> getRecipiente() {
            return recipiente;
        }

        public String getSubobjeto() {
            return subobjeto;
        }

        public String getCuerpo() {
            return cuerpo;
        }

        public List<String> getAttachments() {
            return attachments;
        }
    }

