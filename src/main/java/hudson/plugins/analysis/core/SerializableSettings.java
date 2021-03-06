package hudson.plugins.analysis.core;

import java.io.Serializable;

/**
 * Serializable settings that could be transferred to slaves.
 *
 * @author Ulli Hafner
 */
public class SerializableSettings implements Settings, Serializable {
    private static final long serialVersionUID = 2078877884081589761L;

    private final boolean failOnCorrupt;
    private final boolean quietMode;

    /**
     * Creates a new instance of {@link SerializableSettings}.
     *
     * @param original
     *            the original settings
     */
    public SerializableSettings(final Settings original) {
        failOnCorrupt = original.getFailOnCorrupt();
        quietMode = original.getQuietMode();
    }

    /** {@inheritDoc} */
    public Boolean getQuietMode() {
        return quietMode;
    }

    /** {@inheritDoc} */
    public Boolean getFailOnCorrupt() {
        return failOnCorrupt;
    }
}

