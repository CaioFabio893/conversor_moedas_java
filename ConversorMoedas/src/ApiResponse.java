public class ApiResponse {
    private ConversionRates conversion_rates;

    // Getters e setters
    public ConversionRates getConversion_rates() {
        return conversion_rates;
    }

    public void setConversion_rates(ConversionRates conversion_rates) {
        this.conversion_rates = conversion_rates;
    }

    public static class ConversionRates {
        private double USD;
        private double ARS;
        private double COP;
        private double BRL;

        // Getters e setters
        public double getUSD() {
            return USD;
        }

        public void setUSD(double USD) {
            this.USD = USD;
        }

        public double getARS() {
            return ARS;
        }

        public void setARS(double ARS) {
            this.ARS = ARS;
        }

        public double getCOP() {
            return COP;
        }

        public void setCOP(double COP) {
            this.COP = COP;
        }

        public double getBRL() {
            return BRL;
        }

        public void setBRL(double BRL) {
            this.BRL = BRL;
        }
    }
}