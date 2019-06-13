package org.openhab.io.semantic.dogont.internal.util;

import java.util.ArrayList;
import java.util.List;

import org.openhab.io.semantic.core.model.SimpleDeviceModel.DeviceInfo;
import org.openhab.io.semantic.core.model.SimpleDeviceModel.DeviceState;
import org.openhab.io.semantic.core.model.SimpleDeviceModel.GroupBox;
import org.openhab.io.semantic.core.model.SimpleDeviceModel.UnitOfMeasure;

public class DeviceInfoService {
    private List<DeviceInfo> internalDeviceInfo;

    public DeviceInfoService() {
        internalDeviceInfo = getDeviceInfos();
    }

    public List<DeviceInfo> getDeviceInfos() {
        List<DeviceInfo> infos = new ArrayList<>();
        infos.add(createTinkerforgeIRTempInfos());
        return infos;
    }

    private DeviceInfo createTinkerforgeIRTempInfos() {
        DeviceInfo tinkerforgeIrTemp = new DeviceInfo();
        tinkerforgeIrTemp.Uid = "tinkerforge_irTemp_1";
        tinkerforgeIrTemp.DisplayName = "Tinkerforge IR Temp";

        UnitOfMeasure degree = new UnitOfMeasure();

        degree.UnitName = "degree-Celsius";
        degree.UnitType = "temperature";
        degree.PrefixSymbol = "°C";

        GroupBox boxIr = new GroupBox();

        boxIr.Uid = "box_ir_1";
        boxIr.Name = "IR Temp";
        boxIr.IconName = "temp";

        GroupBox boxAmb = new GroupBox();

        boxAmb.Uid = "box_amb_1";
        boxAmb.Name = "Ambiente Temp";
        boxAmb.IconName = "temp";

        DeviceState irTempState = new DeviceState();

        irTempState.ItemId = "tinkerforge_irTemp_irTemp_1";
        irTempState.Label = "Object Temp";
        irTempState.UnitOfMeasure = degree;
        irTempState.RealStateValue = "20";
        irTempState.StateType = "dogont:TemperatureState";
        irTempState.GroupBox = boxIr;

        DeviceState ambTempState = new DeviceState();
        ambTempState.ItemId = "tinkerforge_irTemp_ambTemp_1";
        ambTempState.Label = "Ambiente Temp";
        ambTempState.UnitOfMeasure = degree;
        ambTempState.RealStateValue = "15";
        ambTempState.StateType = "dogont:TemperatureState";
        ambTempState.GroupBox = boxAmb;

        tinkerforgeIrTemp.States = new DeviceState[] { irTempState, ambTempState };
        tinkerforgeIrTemp.GroupBoxes = new GroupBox[] { boxAmb, boxIr };
        return tinkerforgeIrTemp;
    }

    // private DeviceInfo CreateTinkerforgeLuminance()
    // {
    // DeviceInfo info = new DeviceInfo()
    // {
    // Uid = "tinkerforge_ambientLight_2",
    // DisplayName = "Ambient Light Sensor"
    // };
    //
    // GroupBox boxLum = new GroupBox()
    // {
    // Uid = "box_lum_1",
    // Name = "Luminance",
    // IconName = "light"
    // };
    //
    // UnitOfMeasure lux = new UnitOfMeasure()
    // {
    // UnitName = "lux",
    // UnitType = "light",
    // PrefixSymbol = "Lux"
    // };
    //
    // DeviceState ambienteLight = new DeviceState()
    // {
    // ItemId = "tinkerforge_ambientLight_ambientLight_2",
    // Label = "Luminance",
    // UnitOfMeasure = lux,
    // GroupBox = boxLum,
    // RealStateValue = "150"
    // };
    //
    // info.States = new[] { ambienteLight };
    // info.GroupBoxes = new[] { boxLum };
    // return info;
    // }
    //
    // // TODO create Hue stuff
    // private DeviceInfo CreateHue()
    // {
    // DeviceInfo info = new DeviceInfo()
    // {
    // DisplayName = "Hue Bulb 1",
    // Uid = "hue_bulb210_1"
    // };
    //
    // GroupBox box = new GroupBox()
    // {
    // Uid = "box_hue_1",
    // Name = "Hue Bulb 1",
    // IconName = "color_light"
    // };
    //
    // DeviceState state = new DeviceState()
    // {
    // ItemId = "hue_bulb210_light_1",
    // Label = "State",
    // RealStateValue = "OFF",
    // GroupBox = box
    // };
    //
    // DeviceCommand onCommand = new DeviceCommand()
    // {
    // Name = "DEFAULT_ON_COMMAND",
    // RealCommandName = "ON",
    // CommandType = "dogont:OnCommand"
    // };
    //
    // DeviceCommand offCommand = new DeviceCommand()
    // {
    // Name = "DEFAULT_OFF_COMMAND",
    // RealCommandName = "OFF",
    // CommandType = "dogont:OffCommand"
    // };
    //
    // DeviceCommand upCommand = new DeviceCommand()
    // {
    // Name = "DEFAULT_UP_COMMAND",
    // RealCommandName = "INCREASE",
    // CommandType = "dogont:UpCommand"
    // };
    //
    // DeviceCommand downCommand = new DeviceCommand()
    // {
    // Name = "DEFAULT_DOWN_COMMAND",
    // RealCommandName = "DECREASE",
    // CommandType = "dogont:DownCommand"
    // };
    //
    // DeviceCommand colorCommand = new DeviceCommand()
    // {
    // Name = "DEFAULT_COLOR_COMMAND",
    // RealCommandName = "359,100,100",
    // CommandType = "dogont:SetColorHSBCommand"
    // };
    //
    // DeviceFunctionality lightOnOff = new DeviceFunctionality()
    // {
    // FunctionalityType = "dogont:OnOffFunctionality",
    // Commands = new[] { onCommand, offCommand },
    // ItemId = "hue_bulb210_light_1",
    // GroupBox = box
    // };
    //
    // DeviceFunctionality lightDimm = new DeviceFunctionality()
    // {
    // FunctionalityType = "dogont:LevelControlFunctionality",
    // Commands = new[] { upCommand, downCommand },
    // ItemId = "hue_bulb210_dimmer_1",
    // GroupBox = box
    // };
    //
    // DeviceFunctionality color = new DeviceFunctionality()
    // {
    // FunctionalityType = "dogont:ColorControlFunctionality",
    // Commands = new[] { colorCommand },
    // ItemId = "hue_bulb210_color_1",
    // GroupBox = box
    // };
    //
    // info.Functionalities = new[] { lightOnOff, lightDimm, color };
    // info.States = new[] { state };
    // info.GroupBoxes = new[] { box };
    // return info;
    // }
    //
    // private DeviceInfo CreateHomematicDimmer()
    // {
    // DeviceInfo homematicDimmer = new DeviceInfo()
    // {
    // Uid = "homematic_dimmer_1",
    // DisplayName = "Homematic Dimmer"
    // };
    //
    // GroupBox box = new GroupBox()
    // {
    // Uid = "box_dimmer_1",
    // Name = "Dimmer 1",
    // IconName = "dimmer"
    // };
    //
    // DeviceCommand onCommand = new DeviceCommand()
    // {
    // Name = "DEFAULT_ON_COMMAND",
    // RealCommandName = "ON",
    // CommandType = "dogont:OnCommand"
    // };
    //
    // DeviceCommand offCommand = new DeviceCommand()
    // {
    // Name = "DEFAULT_OFF_COMMAND",
    // RealCommandName = "OFF",
    // CommandType = "dogont:OffCommand"
    // };
    //
    // DeviceCommand upCommand = new DeviceCommand()
    // {
    // Name = "DEFAULT_UP_COMMAND",
    // RealCommandName = "UP",
    // CommandType = "dogont:UpCommand"
    // };
    //
    // DeviceCommand downCommand = new DeviceCommand()
    // {
    // Name = "DEFAULT_DOWN_COMMAND",
    // RealCommandName = "DOWN",
    // CommandType = "dogont:DownCommand"
    // };
    //
    // DeviceFunctionality f1 = new DeviceFunctionality()
    // {
    // FunctionalityType = "dogont:LevelControlFunctionality",
    // ItemId = "homematic_dimmer_dimmer_1",
    // Commands = new[] { onCommand, offCommand, upCommand, downCommand },
    // GroupBox = box
    // };
    // }

}
