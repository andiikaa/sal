package org.openhab.io.semantic.dogont.internal.performance;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.library.types.StringType;
import org.eclipse.smarthome.core.types.Command;
import org.eclipse.smarthome.core.types.CommandDescription;
import org.eclipse.smarthome.core.types.State;
import org.eclipse.smarthome.core.types.StateDescription;

public class PerformanceItem implements Item {
    private String name;

    public PerformanceItem(String name) {
        this.name = name;
    }

    @Override
    public State getState() {
        return StringType.EMPTY;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "";
    }

    @Override
    public List<Class<? extends State>> getAcceptedDataTypes() {
        return new ArrayList<Class<? extends State>>();

    }

    @Override
    public List<Class<? extends Command>> getAcceptedCommandTypes() {
        return new ArrayList<Class<? extends Command>>();
    }

    @Override
    public List<String> getGroupNames() {
        return new ArrayList<String>();
    }

    @Override
    public Set<String> getTags() {
        return new HashSet<String>();
    }

    @Override
    public String getLabel() {
        return null;
    }

    @Override
    public boolean hasTag(String tag) {
        return false;
    }

    @Override
    public String getCategory() {
        return null;
    }

    @Override
    public StateDescription getStateDescription() {
        return null;
    }

    @Override
    public StateDescription getStateDescription(Locale locale) {
        return null;
    }

    @Override
    public String getUID() {
        return "UID_for_" + name;
    }

    @Override
    public <T extends @NonNull State> @Nullable T getStateAs(Class<T> typeClass) {
        return null;
    }

    @Override
    public @Nullable CommandDescription getCommandDescription(@Nullable Locale locale) {
        return null;
    }

}
