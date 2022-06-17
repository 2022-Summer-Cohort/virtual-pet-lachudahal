package VirtualPetAmok;

public abstract class RoboticPets extends VirtualPets {
    protected int oilLevel;
    protected int maintenance;
    protected int chargeLevel;


    public RoboticPets(String name, int health, int oilLevel, int maintenance, int chargeLevel) {
        super(name, health);
        this.oilLevel = oilLevel;
        this.maintenance = maintenance;
        this.chargeLevel = chargeLevel;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public int getMaintenance() {
        return maintenance;
    }
    public int getChargeLevel(){
        return chargeLevel;
    }
    public void oilLevelUpdate(){
        oilLevel--;
    }
    public void maintenanceLevelUpdate(){
        maintenance--;
    }
    public void updateChargeLevel(){
        chargeLevel--;
    }
    @Override
    public void tick(){
        oilLevel++;
        maintenance++;
        chargeLevel++;
    }
}
