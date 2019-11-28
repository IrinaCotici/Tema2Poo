package heroes;

import constants.ModifierConstants;

import java.util.ArrayList;

public class HeroManager {

    //Rogue vectors
    public ArrayList completeRogueFirstDamage() {
        ArrayList <Float> rogueFirstDamageModifier = new ArrayList<>();
        rogueFirstDamageModifier.add(ModifierConstants.BACKSTAB_ROGUE);
        rogueFirstDamageModifier.add(ModifierConstants.BACKSTAB_KNIGHT);
        rogueFirstDamageModifier.add(ModifierConstants.BACKSTAB_PYROMANCER);
        rogueFirstDamageModifier.add(ModifierConstants.BACKSTAB_WIZARD);
        return rogueFirstDamageModifier;
    }
    public ArrayList completeRogueSecondDamage() {
        ArrayList<Float> rogueSecondDamageModifier = new ArrayList<>();
        rogueSecondDamageModifier.add(ModifierConstants.PARALYSIS_ROGUE);
        rogueSecondDamageModifier.add(ModifierConstants.PARALYSIS_KNIGHT);
        rogueSecondDamageModifier.add(ModifierConstants.PARALYSIS_PYROMANCER);
        rogueSecondDamageModifier.add(ModifierConstants.PARALYSIS_WIZARD);
        return rogueSecondDamageModifier;
    }

    //Knight vectors
    public ArrayList completeKnightFirstDamage() {
        ArrayList<Float> knightFirstDamageModifier = new ArrayList<>();
        knightFirstDamageModifier.add(ModifierConstants.EXECUTE_ROGUE);
        knightFirstDamageModifier.add(ModifierConstants.EXECUTE_KNIGHT);
        knightFirstDamageModifier.add(ModifierConstants.EXECUTE_PYROMANCER);
        knightFirstDamageModifier.add(ModifierConstants.EXECUTE_WIZARD);
        return knightFirstDamageModifier;
    }
    public ArrayList completeKnightSecondDamage() {
        ArrayList<Float> knightSecondDamageModifier = new ArrayList<>();
        knightSecondDamageModifier.add(ModifierConstants.SLAM_ROGUE);
        knightSecondDamageModifier.add(ModifierConstants.SLAM_KNIGHT);
        knightSecondDamageModifier.add(ModifierConstants.SLAM_PYROMANCER);
        knightSecondDamageModifier.add(ModifierConstants.SLAM_WIZARD);
        return knightSecondDamageModifier;
    }

    //Pyromancer vectors
    public ArrayList completePyromancerFirstDamage() {
        ArrayList<Float> pyromancerFirstDamageModifier = new ArrayList<>();
        pyromancerFirstDamageModifier.add(ModifierConstants.FIREBLAST_ROGUE);
        pyromancerFirstDamageModifier.add(ModifierConstants.FIREBLAST_KNIGHT);
        pyromancerFirstDamageModifier.add(ModifierConstants.FIREBLAST_PYROMANCER);
        pyromancerFirstDamageModifier.add(ModifierConstants.FIREBLAST_WIZARD);
        return pyromancerFirstDamageModifier;
    }
    public ArrayList completePyromancerSecondDamage() {
        ArrayList<Float> pyromancerSecondDamageModifier = new ArrayList<>();
        pyromancerSecondDamageModifier.add(ModifierConstants.IGNITE_ROGUE);
        pyromancerSecondDamageModifier.add(ModifierConstants.IGNITE_KNIGHT);
        pyromancerSecondDamageModifier.add(ModifierConstants.IGNITE_PYROMANCER);
        pyromancerSecondDamageModifier.add(ModifierConstants.IGNITE_WIZARD);
        return pyromancerSecondDamageModifier;
    }

    //Wizard vectors
    public ArrayList completeWizardFirstDamage() {
        ArrayList<Float> wizardFirstDamageModifier = new ArrayList<>();
        wizardFirstDamageModifier.add(ModifierConstants.DRAIN_ROGUE);
        wizardFirstDamageModifier.add(ModifierConstants.DEFLECT_KNIGHT);
        wizardFirstDamageModifier.add(ModifierConstants.DRAIN_PYROMANCER);
        wizardFirstDamageModifier.add(ModifierConstants.DRAIN_WIZARD);
        return wizardFirstDamageModifier;
    }
    public ArrayList completeWizardSecondDamage() {
        ArrayList<Float> wizardSecondDamageModifier = new ArrayList<>();
        wizardSecondDamageModifier.add(ModifierConstants.DEFLECT_ROGUE);
        wizardSecondDamageModifier.add(ModifierConstants.DEFLECT_KNIGHT);
        wizardSecondDamageModifier.add(ModifierConstants.DEFLECT_PYROMANCER);
        wizardSecondDamageModifier.add(ModifierConstants.DEFLECT_WIZARD);
        return wizardSecondDamageModifier;
    }


}
