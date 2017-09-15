import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
	return students;
	}

	@Override
	public void setStudents(Student[] students) {
		if(students==null){throw new IllegalArgumentException();}
		this.students=students;
	}

	@Override
	public Student getStudent(int index) {
		if(index<0||index>=students.length){throw new IllegalArgumentException();}
		return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		if(index<0||index>=students.length||student==null){throw new IllegalArgumentException();}
		students[index]=student;
	}

	@Override
	public void addFirst(Student student) {
		if(student==null){throw new IllegalArgumentException();}

		Student[] data=new Student[students.length+1];
			data[0]=student;
			for(int i=1;i<data.length;i++)
				data[i]=students[i-1];
		students=data;
	}

	@Override
	public void addLast(Student student) {
		if(student==null){throw new IllegalArgumentException();}
		Student[] data=new Student[students.length+1];
		int i=0;
			for( i=0;i<students.length;i++)
				data[i]=students[i];
			data[i]=student;
		students=data;
	}

	@Override
	public void add(Student student, int index) {
		if(index<0||index>=students.length||student==null){throw new IllegalArgumentException();}
      Student[] data=new Student[students.length+1];
              for(int i=0;i<data.length;i++)
        {
        	if(index>i)data[i]=students[i];
        	else if(index==i)data[i]=student;
        	else data[i]=students[i-1];
        }
        students=data;
	}

	@Override
	public void remove(int index) {
	if(index<0||index>=students.length){throw new IllegalArgumentException();}
	Student[] data=new Student[students.length-1];
	 for(int i=0;i<data.length+1;i++)
	 {
	 	if(index>i)data[i]=students[i];
	 	else if(index<i) data[i-1]=students[i];
	 	else continue;
	 }
	 students=data;
	}

	@Override
	public void remove(Student student) {
		Student[] data=new Student[students.length-1];
		 int i=0;
		 boolean x=false;
		 for( i=0;i<data.length+1;i++)
		 {
		 	if(x==true)data[i-1]=students[i];
		 	else if(student.compareTo(students[i])==0)x=true;
		 		else data[i]=students[i];
		 }
		 if(x==false){throw new IllegalArgumentException("Student not exist");}
		 else students=data;
	}

	@Override
	public void removeFromIndex(int index) {
		if(index<0||index>=students.length){throw new IllegalArgumentException();}
		Student[] data=new Student[index+1];
        for(int i=0;i<data.length;i++)
        	data[i]=students[i];
        students=data;
	}

	@Override
	public void removeFromElement(Student student) {
		if(student==null){throw new IllegalArgumentException();}
		int i=0;
		for(i=0;i<students.length;i++)
		{
if(student.compareTo(students[i])==0)break;
		}
		System.out.println(i);
		Student[] data=new Student[i+1];
        for(int k=0;k<=i;k++)
        	data[k]=students[k];
        students=data;
	}

	@Override
	public void removeToIndex(int index) {
		if(index<0||index>=students.length){throw new IllegalArgumentException();}
	Student[] data=new Student[students.length-index];
		int k=0;
		for(int i=index;i<students.length;i++)
		{
			data[k++]=students[i];
		}
		students=data;
	}

	@Override
	public void removeToElement(Student student) {
		if(student==null){throw new IllegalArgumentException();}
		int i=0;
		for(i=0;i<students.length;i++)
		{
			if(student.compareTo(students[i])==0)break;
		}
         Student[] data=new Student[students.length-i];
         int k=0;
		for(int j=i;j<students.length;j++)
		{
			data[k++]=students[j];
		}
		students=data;
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		if(date==null){throw new IllegalArgumentException();}
/*int l=0;
		for(int i=0;i<students.length;i++)
		{
			if(students[i].birthDate<=date)l++;
		}
		if(l==0)return null;
		Student[] data=new Student[l];
		int k=0;
		for(int i=0;i<students.length;i++)
		{
			if(students[i].birthDate<=date)data[k++]=students[i];
		}
		return data;*/
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
				if(firstDate==null||lastDate==null){throw new IllegalArgumentException();}
/*int l=0;
		for(int i=0;i<students.length;i++)
		{
			if(students[i].birthDate<=lastDate||students[i].birthDate>=firstDate)l++;
		}
		if(l==0)return null;
		Student[] data=new Student[l];
		int k=0;
		for(int i=0;i<students.length;i++)
		{
			if(students[i].birthDate<=lastDate||students[i].birthDate>=firstDate)data[k++]=students[i];
		}
		return data;*/
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		/*Student x=students[indexOfStudent];
		int l=2017-x.Date.getYear();
		int k=9-x.getMonth();
		int m=15-x.getDay();
		if(k>0) return l;
		if(k==0&&m>=0)return l;
		return l-1;*/
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
