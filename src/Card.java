public class Card {

        private String suit;
        private String rank;
        private Integer value;

        public String getSuit() {
            return suit;
        }

        public void setSuit(String suit) {
            this.suit = suit;
        }

        public String getRank() {
            return rank;
        }

        public void setRank(String rank) {
            this.rank = rank;
        }



        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        Card(String suit, String rank) {
            this.rank = rank;
            this.suit = suit;

        }


        public String toString(){
            return rank + " of " + suit + " | Value: " + value;
        }


    }




