public class Bank {
    private int numberOfLoanOfficers;
    private int numberOfTellers;

    public Bank(int numberOfLoanOfficers, int numberOfTellers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
        this.numberOfTellers = numberOfTellers;
    }

    public int getNumberOfLoanOfficers() {
        return numberOfLoanOfficers;
    }

    public int getNumberOfTellers() {
        return numberOfTellers;
    }

    public void setNumberOfLoanOfficers(int numberOfLoanOfficers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
    }

    public void setNumberOfTellers(int numberOfTellers) {
        this.numberOfTellers = numberOfTellers;
    }

    public void hireMembers(int numberToHire, boolean isLoanOfficer) {
        if (isLoanOfficer) {
            numberOfLoanOfficers += numberToHire;
        } else {
            numberOfTellers += numberToHire;
        }
    }

    public int computeTotalEmployees() {
        return numberOfLoanOfficers + numberOfTellers;
    }

    public String toString() {
        return "this bank has " + numberOfLoanOfficers + " loan officers and " + numberOfTellers
                + " tellers.";
    }

    public boolean equals(Bank other) {
        return this.numberOfLoanOfficers == other.numberOfLoanOfficers
                && this.numberOfTellers == other.numberOfTellers;
    }

    public void transferEmployees(boolean fromLoanOfficerToTeller, int numberToTransfer) {
        if (fromLoanOfficerToTeller) {
            if (numberToTransfer <= numberOfLoanOfficers) {
                numberOfLoanOfficers -= numberToTransfer;
                numberOfTellers += numberToTransfer;
            }
        } else {
            if (numberToTransfer <= numberOfTellers) {
                numberOfTellers -= numberToTransfer;
                numberOfLoanOfficers += numberToTransfer;
            }
        }
    }

    public void fireMembers(int numberToFire, boolean isLoanOfficer) {
        if (isLoanOfficer) {
            if (numberToFire <= numberOfLoanOfficers) {
                numberOfLoanOfficers -= numberToFire;
            }
        } else {
            if (numberToFire <= numberOfTellers) {
                numberOfTellers -= numberToFire;
            }
        }
    }

    public int averageMonthlySalary() {
        int totalSalary = (numberOfLoanOfficers * 70000) + (numberOfTellers * 45000);
        int totalEmployees = computeTotalEmployees();
        if (totalEmployees == 0) {
            return 0; // Avoid division by zero
        }
        return totalSalary / totalEmployees;
    }

    public double getEmployeeRatio() {
        if (numberOfTellers == 0) {
            return Double.POSITIVE_INFINITY; // Avoid division by zero
        }
        return (double) numberOfLoanOfficers / numberOfTellers;
    }
}
