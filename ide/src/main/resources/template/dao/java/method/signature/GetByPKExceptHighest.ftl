<#assign a=addImportStatement(beanPackage+"."+name)><#assign a=addImportStatement("java.util.List")>
	public List<${name}> get${pluralName}(${getPrimaryKeysAsParameterStringExceptHighest()}) throws SQLException 