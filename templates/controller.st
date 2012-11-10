controller(controller) ::= <<
<class_header_file(
	controller_class_name(controller.controllerName),
	"C4Controller",
	"Controller",
	controller_type_definition(controller.controllerName,controller.controllerType))
>

############################################

<class_cpp_file(
	controller_class_name(controller.controllerName),
	controller_type_name(controller.controllerName))
>
>>