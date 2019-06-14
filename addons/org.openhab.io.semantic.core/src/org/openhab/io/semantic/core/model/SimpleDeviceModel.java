package org.openhab.io.semantic.core.model;

public class SimpleDeviceModel {

    /// <summary>
    /// The "Thing"
    /// </summary>
    public static class DeviceInfo {
        public String Uid;
        public String DisplayName;
        public DeviceFunctionality[] Functionalities;
        public DeviceState[] States;
        public GroupBox[] GroupBoxes;

        public MergedThing IsMergedIn;
    }

    /// <summary>
    /// The "Item" which can receive commands, like "ON"
    /// </summary>
    public static class DeviceFunctionality {
        public String Label;
        public String FunctionalityType;
        public String ItemId;
        public DeviceCommand[] Commands;
        public String GroupBoxId;
    }

    /// <summary>
    /// The "Item" which represents a state, such a temperature.
    /// </summary>
    public static class DeviceState {
        public String Label;
        public String StateType;
        public String RealStateValue;
        public String ItemId;
        public UnitOfMeasure UnitOfMeasure;
        public String GroupBoxId;
    }

    /// <summary>
    /// UnitType and UnitName could be derived from the instance uri of the unit in the dogont ontology
    /// E.g. http://elite.polito.it/ontologies/ucum-instances.owl#unit/temperature/degree-Celsius
    /// Type = temperature,
    /// Name = degree-Celsius
    /// </summary>
    public static class UnitOfMeasure {
        public String UnitName;
        public String UnitType;
        public String PrefixSymbol;
    }

    public static class DeviceCommand {
        public String Name;
        public String RealCommandName;
        public String CommandType;
        public String Label;
    }

    /// <summary>
    /// GroupBoxes define grouping for functionality and states
    /// </summary>
    public static class GroupBox {
        public String Uid;
        public String Name;
        public String IconName;
    }

    /// <summary>
    /// Indicates some merges
    /// </summary>
    public static class MergedThing {
        public String Uid;

    }

}
