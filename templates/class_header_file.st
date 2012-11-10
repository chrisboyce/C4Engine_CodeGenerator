class_header_file(className,includeName,parentClass,enumType) ::= <<
<header_file_header(className)>

<include(includeName)>

namespace C4{
	class <className> : public <parentClass>{
	
	
		<if(enumType)>
		enum {
			<enumType>
		};
		<endif>
		public:

		<className>();
		~<className>();
	};
}
#endif
>>
