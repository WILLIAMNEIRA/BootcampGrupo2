package com.co.qvision.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target TXT_TEXTINPUT = Target.the("Ingrese un texto").locatedBy("//input[@id='my-text-id']");
    public static final Target TXT_PASSWORD= Target.the("Ingrese un Password").locatedBy("//input[@name='my-password']");
    public static final Target TXT_TEXTTAREA= Target.the("Ingrese un parrafo").locatedBy("//*[@name='my-textarea']");
    public static final Target LBL_DISABLE= Target.the("Captura texto").locatedBy("//input[@name='my-disabled']");
    public static final Target LBL_READONLY = Target.the("Leer texto").locatedBy("//input[@name='my-readonly']");
    public static final Target SELECT_DROPDOWN = Target.the("Seleccionar caja ").locatedBy("//*[@name='my-select']");
    public static final Target DATALIST_DROPDOWN = Target.the("Seleccionar Lista ").locatedBy("(//input[@name='my-datalist'])");
    public static final Target CHECKED_CHECKBOX = Target.the("Seleccionar Checkbox ").locatedBy("//input[@id='my-check-1']");
    public static final Target DEFAULT_CHECKBOX = Target.the("Seleccionar Checkbox ").locatedBy("//input[@id='my-check-2']");
    public static final Target CHECKED_RADIO = Target.the("Seleccionar Checkbox radio ").locatedBy("//input[@id='my-radio-1']");
    public static final Target DEFAULT_RADIO = Target.the("Seleccionar Checkbox radio por default ").locatedBy("//input[@id='my-radio-2']");
    public static final Target COLOR_PICKER = Target.the("Seleccionar color ").locatedBy("//input[@name='my-colors']");









}
