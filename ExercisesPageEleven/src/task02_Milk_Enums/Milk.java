package task02_Milk_Enums;

import java.util.Objects;

public abstract class Milk{

    private FatType fatType;
    private PackageType packageType;
    private Volume volume;

    public Milk(FatType fatType, PackageType packageType, Volume volume) {
        this.fatType = fatType;
        this.packageType = packageType;
        this.volume = volume;
    }

    public FatType getFatType() {
        return fatType;
    }

    public PackageType getPackageType() {
        return packageType;
    }

    public Volume getVolume() {
        return volume;
    }

    public void setFatType(FatType fatType) {
        this.fatType = fatType;
    }

    public void setPackageType(PackageType packageType) {
        this.packageType = packageType;
    }

    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Milk milk = (Milk) o;
        return fatType == milk.fatType && packageType == milk.packageType && volume == milk.volume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fatType, packageType, volume);
    }

    @Override
    public String toString() {
        return "Milk{" +
                "fatType=" + fatType +
                ", packageType=" + packageType +
                ", volume=" + volume +
                '}';
    }
}
