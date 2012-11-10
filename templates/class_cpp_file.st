class_cpp_file(className,controllerTypeName) ::= <<

<include(className)>

using namespace C4;

<className>::<className>() : Controller(<controllerTypeName>){

}

<className>::~<className>(){}

>>