package com.example.iuliu.aa;

/**
 * Created by Iuliu on 2016-10-18.
 */

public class Medicine {
    private String medicineId;
    private String medicineName;
    private String medicineScol;//?????????????????????
    private String volume;//???????????????
    private String medicineDosage;
    private String medicineInterval;
    private String intervalMedicine;
    private boolean medicineOrder;
    public Medicine(String medicineId, String medicineName,String medicineScol, String volume,String medicineDosage,String medicineInterval, String intervalMedicine,boolean medicineOrder){
        this.medicineId=medicineId;
        this.setMedicineName(medicineName);
        this.setMedicineScol(medicineScol);
        this.setVolume(volume);
        this.setMedicineDosage(medicineDosage);
        this.setMedicineInterval(medicineInterval);
        this.setIntervalMedicine(intervalMedicine);
        this.setMedicineOrder(medicineOrder);
    }

    public String getMedicineName() {
        return medicineName;
    }

    public String getMedicineScol() {
        return medicineScol;
    }

    public String getVolume() {
        return volume;
    }

    public String getMedicineDosage() {
        return medicineDosage;
    }

    public String getMedicineInterval() {
        return medicineInterval;
    }

    public String getIntervalMedicine() {
        return intervalMedicine;
    }

    public boolean isMedicineOrder() {
        return medicineOrder;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public void setMedicineScol(String medicineScol) {
        this.medicineScol = medicineScol;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public void setMedicineDosage(String medicineDosage) {
        this.medicineDosage = medicineDosage;
    }

    public void setMedicineInterval(String medicineInterval) {
        this.medicineInterval = medicineInterval;
    }

    public void setIntervalMedicine(String intervalMedicine) {
        this.intervalMedicine = intervalMedicine;
    }

    public void setMedicineOrder(boolean medicineOrder) {
        this.medicineOrder = medicineOrder;
    }
}
