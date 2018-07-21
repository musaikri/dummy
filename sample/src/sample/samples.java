package sample;

public class samples {
	
	@Test
	public void testValidEmailId() throws Exception {
	    /*Arrange*/
	    EmployeeEmail empEmail=new EmployeeEmail();
	    /*Act*/
	    boolean result = empEmail.isValidEmailId("andy@testdomain.com");
	    /*Assert*/
	    assertTrue("Valid email ID failed ", result );
	}
	@Test
	public void testInvalidEmailId() throws Exception {
	    /*Arrange*/
	    EmployeeEmail empEmail=new EmployeeEmail();
	    /*Act*/
	    boolean result= empEmail.isValidEmailId("andy@testdomain");
	    /*Assert*/
	    assertFalse("Invalid email ID passed ", result);
	}
	
	
	
	
	
	
	
	ublic class EmployeeEmailTest {
	    @Test
	    public void testValidEmailId() throws Exception {
	        /*Arrange*/
	        EmployeeEmail empEmail=new EmployeeEmail();
	        /*Act*/
	        boolean result = empEmail.isValidEmailId("andy@testdomain.com");
	        /*Assert*/
	        assertTrue("Valid email ID failed ", result );
	    }
	    @Test
	    public void testInvalidEmailId() throws Exception {
	        /*Arrange*/
	        EmployeeEmail empEmail=new EmployeeEmail();
	        /*Act*/
	        boolean result= empEmail.isValidEmailId("andy@testdomain");
	        /*Assert*/
	        assertFalse("Invalid email ID passed ", result);
	    }
	    @Test
	    public void testAddEmailId() throws Exception {
	        /*Arrange*/
	        EmployeeEmail empEmail=new EmployeeEmail();
	        empEmail.addEmployeeEmailId("Emp01","peter@testdomain.com");
	        empEmail.addEmployeeEmailId("Emp02", "mary@testdomain.com");
	        /*Act*/
	        int size=empEmail.hashMap.size();
	        /*Assert*/
	        assertEquals("Incorrect collection size ", 2, size);
	    }
	    @Test
	    public void testAddEmailIdWithDuplicateKey() throws Exception {
	        /*Arrange*/
	        EmployeeEmail empEmail=new EmployeeEmail();
	        empEmail.addEmployeeEmailId("Emp01","peter@testdomain.com");
	        empEmail.addEmployeeEmailId("Emp02", "mary@testdomain.com");
	        empEmail.addEmployeeEmailId("Emp02", "henry@testdomain.com");
	        /*Act*/
	        int size=empEmail.hashMap.size();
	        /*Assert*/
	        assertNotEquals("Duplicate key in collection ", 3, size);
	    }
	    @Test
	    public void testGetExistingEmailId() throws Exception {
	        /*Arrange*/
	        EmployeeEmail empEmail=new EmployeeEmail();
	        empEmail.addEmployeeEmailId("Emp01","peter@testdomain.com");
	        empEmail.addEmployeeEmailId("Emp02", "mary@testdomain.com");
	        /*Act*/
	        String val = empEmail.getEmployeeEmailId("Emp02");
	        /*Assert*/
	        assertNotNull("Returned null for existing employee", val);
	    }
	    @Test
	    public void testGetNonExistingEmailId() throws Exception {
	        /*Arrange*/
	        EmployeeEmail empEmail=new EmployeeEmail();
	        empEmail.addEmployeeEmailId("Emp01","peter@testdomain.com");
	        empEmail.addEmployeeEmailId("Emp02", "mary@testdomain.com");
	       /*Act*/
	        String val = empEmail.getEmployeeEmailId("Emp05");
	       /*Assert*/
	        assertNull("Failed to return null for non existing employee", val);
	    }
	    @Test
	    public void testIfObjectsAreSame() throws Exception {
	        /*Arrange*/
	        EmployeeEmail empEmail1=new EmployeeEmail();
	        empEmail1.addEmployeeEmailId("Emp01","peter@testdomain.com");
	        EmployeeEmail empEmail2=new EmployeeEmail();
	        empEmail1.addEmployeeEmailId("Emp02", "mary@testdomain.com");
	        /*Act*/
	        Map map1=empEmail1.hashMap;
	        Map map2=empEmail2.hashMap;
	        map1= map2;
	        /*Assert*/
	        assertSame("Failed because objects are not same ", map1, map2);
	    }
	    @Test
	    public void testIfObjectsAreNotSame() throws Exception {
	        /*Arrange*/
	        EmployeeEmail empEmail1=new EmployeeEmail();
	        empEmail1.addEmployeeEmailId("Emp01","peter@testdomain.com");
	        EmployeeEmail empEmail2=new EmployeeEmail();
	        empEmail1.addEmployeeEmailId("Emp02", "mary@testdomain.com");
	        /*Act*/
	        Map map1=empEmail1.hashMap;
	        Map map2=empEmail2.hashMap;
	        /*Assert*/
	        assertNotSame("Failed because objects are same ", map1, map2);
	    }
	}
	
	
	
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testForIllegalArgumentException()
	{
	    String val = empEmail.getEmployeeEmailId(1);
	}
	. . .

	
	
	
	
	public class CaculatorTest {
		8
		9 Calculator cal;
		10
		11 @Before
		12 /*
		13 the init() method will be called for each test, such
		14 testAdd() as well as testSub()
		15 */
		16 public void init() {
		17
		18 cal = new Calculator();
		19
		20 }
		21
		22 @Test
		23 public void testAdd() {
		24
		25 int x = 10;
		26 int y = 20;
		27 assertEquals(30, cal.add(x, y));
		28
		29 }
		30
		31 @Test
		32 public void testSub() {
		33 int x = 10;
		34 int y = 20;
		35 assertEquals(-10, cal.sub(x, y));
		36 }
		37
		38 }
	
	
	
	
	
	 public void testAssertMap() {

	        Map<String, String> map = new HashMap<>();
	        map.put("j", "java");
	        map.put("c", "c++");
	        map.put("p", "python");
	        map.put("n", "node");

	        Map<String, String> expected = new HashMap<>();
	        expected.put("n", "node");
	        expected.put("c", "c++");
	        expected.put("j", "java");
	        expected.put("p", "python");

	        //All passed / true

	        //1. Test equal, ignore order
	        assertThat(map, is(expected));

	        //2. Test size
	        assertThat(map.size(), is(4));

	        //3. Test map entry, best!
	        assertThat(map, IsMapContaining.hasEntry("n", "node"));

	        assertThat(map, not(IsMapContaining.hasEntry("r", "ruby")));

	        //4. Test map key
	        assertThat(map, IsMapContaining.hasKey("j"));

	        //5. Test map value
	        assertThat(map, IsMapContaining.hasValue("node"));

	    }
	 
	 
	 
	 
	 
	 
	 @Test
	    public void testRemove() {
	        final MiniHashMap<String, Integer> map = new MiniHashMap<String, Integer>();
	        map.put("Lars", 1);
	        map.put("Günther", 12);
	        map.put("Max", 2);

	        assertEquals(null, map.get("Markus"));
	        assertEquals(1, map.get("Lars"), 0);
	        assertEquals(2, map.get("Max"), 0);
	        assertEquals(12, map.get("Günther"), 0);

	        map.remove("Max");
	        assertEquals(null, map.get("Markus"));
	        assertEquals(1, map.get("Lars"), 0);
	        assertEquals(null, map.get("Max"));
	        assertEquals(12, map.get("Günther"), 0);

	        assertEquals(true, map.remove("Lars"));
	        assertEquals(false, map.remove("Lars"));
	        assertEquals(null, map.get("Markus"));
	        assertEquals(null, map.get("Lars"));
	        assertEquals(null, map.get("Max"));
	        assertEquals(12, map.get("Günther"), 0);

	        map.put("Lars", 1);
	        map.put("Günther", 12);
	        map.put("Max", 2);
	        assertEquals(true, map.remove("Günther"));

	    }

	    @Test
	    public void testStandard() {
	        final MiniHashMap<String, Integer> map = new MiniHashMap<String, Integer>();
	        map.put("Lars", 1);
	        map.put("Günther", 12);
	        map.put("Max", 2);

	        assertEquals(null, map.get("Markus"));
	        assertEquals(1, map.get("Lars"), 0);
	        assertEquals(2, map.get("Max"), 0);
	        assertEquals(12, map.get("Günther"), 0);

	    }

	    @Test
	    public void testDoublePut() {
	        final MiniHashMap<String, Integer> map = new MiniHashMap<String, Integer>();
	        map.put("Lars", 1);
	        map.put("Günther", 12);

	        assertEquals(1, map.get("Lars"), 0);
	        assertEquals(12, map.get("Günther"), 0);

	        map.put("Lars", 14);
	        map.put("Günther", 122);
	        map.put("Fred", 11111);
	        assertEquals(14, map.get("Lars"), 0);
	        assertEquals(122, map.get("Günther"), 0);
	    }

	    @Test
	    public void testBigNumber() {
	        final MiniHashMap<String, Integer> map = new MiniHashMap<String, Integer>();
	        final int maxIndex = 33; // set this to big number 
	        for (int i = 0; i < maxIndex; i++) {
	            map.put("Tom" + String.valueOf(i), i);
	        }

	        for (int i = 0; i < maxIndex; i++) {
	            assertEquals(map.get("Tom" + String.valueOf(i)), i, 0);
	        }

	    }

	    @Test
	    public void testRemoveBigNumber() {
	        final MiniHashMap<String, Integer> map = new MiniHashMap<String, Integer>();
	        final int maxIndex = 1000;
	        for (int i = 0; i < maxIndex; i++) {
	            final String key = "Tom" + String.valueOf(i);
	            map.put(key, i);
	        }

	        for (int i = maxIndex / 3; i < (maxIndex / 2); i++) {
	            assertTrue(map.remove("Tom" + String.valueOf(i)));
	        }

	        for (int i = 0; i < maxIndex; i++) {
	            if ((i >= (maxIndex / 3)) && (i < (maxIndex / 2))) {
	                assertEquals(null, map.get("Tom" + String.valueOf(i)));
	            } else {
	                assertEquals(map.get("Tom" + String.valueOf(i)), i, 0);
	            }
	        }
	    }

	    @Test
	    public void testRandom() {
	        final MiniHashMap<String, Integer> map = new MiniHashMap<String, Integer>(997);
	        final HashMap<String, Integer> mapJdK = new HashMap<String, Integer>(997);

	        final int maxIndex = 10000;
	        for (int i = 0; i < maxIndex; i++) {
	            final String key = "Tom" + String.valueOf((int) (Math.random() * maxIndex));
	            map.put(key, i);
	            mapJdK.put(key, i);
	            assertEquals(map.get(key), mapJdK.get(key), 0);
	        }

	        for (int i = 0; i < maxIndex; i++) {
	            final String key = "Tom" + String.valueOf((int) (Math.random() * maxIndex));
	            map.put(key, i);
	            mapJdK.put(key, i);
	            assertEquals(map.get(key), mapJdK.get(key), 0);
	        }

	        for (int i = 0; i < maxIndex; i++) {
	            final String key = "Tom" + String.valueOf((int) (Math.random() * maxIndex));
	            if ((null != map.get(key)) || (null != mapJdK.get(key))) {
	                assertEquals(map.get(key), mapJdK.get(key), 0);
	            }
	        }

	        for (int i = 0; i < maxIndex; i++) {
	            final String key = "Tom" + String.valueOf((int) (Math.random() * maxIndex));
	            map.remove(key);
	            mapJdK.remove(key);
	            assertNull(map.get(key));
	            assertNull(mapJdK.get(key));
	        }
	    }
	
	
	Import .*;

Class abs

{

DataInputStream dis = new DataInputStream();

Int a,b,c;

a=Integer.parseInt(dis.readLine());

b=Integer.parseInt(dis.readLine());

c=a+b;

System.out println(c);

}
	
	
	
	
	BufferedReader kin = new BufferedReader ( new InputStreamReader();
kin.readline();
	}

}
