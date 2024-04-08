public class RewardValue {
        private double cash;
        private double miles;

        public RewardValue(int miles){
            this.miles =miles;
            this.cash =miles*0.0035;
        }
        public RewardValue(double cash){
            this.cash =cash;
            this.miles =cash/0.0035;
        }
        public double getMilesValue(){
            return this.miles;
        }
        public double getCashValue(){
            return this.cash;
        }
    };

