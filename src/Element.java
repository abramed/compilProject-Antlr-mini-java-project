 public class Element
    {
        private String name;
        private Boolean declared;
        private String type;
        private float valeur;

        public Element(String name, Boolean declared, String type, float valeur){
            this.name = name;
            this.declared = declared;
            this.type = type;
            this.valeur = valeur;
        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public Boolean getDeclared () {
            return declared;
        }

        public void setDeclared (Boolean declared){
            this.declared = declared;
        }

        public String getType () {
            return type;
        }

        public void setType (String type){
            this.type = type;
        }

        public float getValeur () {
            return valeur;
        }

        public void setValeur ( float valeur){
            this.valeur = valeur;
        }

        @Override
        public String toString() {
            return "Element{" +
                    "name='" + name + '\'' +
                    ", declared=" + declared +
                    ", type='" + type + '\'' +
                    ", valeur=" + valeur +
                    '}';
        }
    }


