package net.gommehd.cheetah.cache;

/**
 * @author David (_Esel)
 */
public class Textures {
    private final String value;
    private final String signature;

    public Textures(String value, String signature) {
        this.value = value;
        this.signature = signature;
    }

    public String getValue() {
        return this.value;
    }

    public String getSignature() {
        return this.signature;
    }
}
