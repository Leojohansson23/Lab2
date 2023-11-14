public interface Carrier {
    void carrierHigher();
    void carrierLower();
/*
    @Override
    public void carrierHigher(int degree) {
        if(getCurrentSpeed() == 0) {
            if ((getangle() + degree) <= maxAngle) {
                setangle(getangle() + degree);
            }
            else {setangle(maxAngle);

            }
        }
    }

    @Override
    public void carrierLower(int degree) {
        if(getCurrentSpeed() == 0) {
            if ((getangle() - degree) >= minAngle) {
                setangle(getangle() - degree);
            }
            else {setangle(minAngle);
            }

        }

 */

}
