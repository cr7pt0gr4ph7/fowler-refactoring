abstract class Price {
    abstract double getCharge(int daysRented);

    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}

class RegularPrice extends Price {
    double getCharge(int daysRented) {
        double result = 2;
        if (daysRented > 2)
            result += (daysRented - 2) * 1.5;

        return result;
    }
}

class ChildrensPrice extends Price {
    double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }
}

class NewReleasePrice extends Price {
    @Override
    int getFrequentRenterPoints(int daysRented) {
        // add bonus for a two day new release rental
        return daysRented > 1 ? 2 : 1;
    }

    double getCharge(int daysRented) {
        return daysRented * 3;
    }
}
