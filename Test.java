

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Host;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.reference.V8ValueGlobalObject;

public class Test {

	public static void main(String[] args) throws JavetException {
		System.out.println("========start========");
		
		V8Runtime v8Runtime=V8Host.getNodeInstance().createV8Runtime();
		V8ValueGlobalObject g=v8Runtime.getGlobalObject();
		String str="hello world";
		g.set("str",str);
		byte[] bt=str.getBytes();
		g.set("btary",bt);
		g.close();
		System.out.println("========end========");
	}

}
