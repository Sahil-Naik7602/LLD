public enum ParkingSlotType {
    SMALL {
        @Override
        public int getPriceForParking(int duration) {
            return duration*5;
        }
    },
    MEDIUM {
        @Override
        public int getPriceForParking(int duration) {
            return duration*10;
        }
    },
    LARGE {
        @Override
        public int getPriceForParking(int duration) {
            return duration*20;
        }
    };

    public abstract int getPriceForParking(int duration);
}
