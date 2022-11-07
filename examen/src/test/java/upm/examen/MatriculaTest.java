package upm.examen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.Arrays;
import java.util.Vector;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;


public class MatriculaTest {
	

	@Test
	public void throwsExceptionWhenAsignaturasVectorIsNull() {
		Matricula matricula = new Matricula(null);
		assertThrows(Exception.class, () -> matricula.getImporte());
	}
	
	@Test
	public void testGetImporteCalculus() throws Exception {
		Vector<Asignatura> vectorAsignaturas = new Vector<Asignatura>(Arrays.asList(new AsignaturaInstance(100), new AsignaturaInstance(200)));
		Matricula matricula = new Matricula(vectorAsignaturas);
		assertEquals(300, matricula.getImporte());
	}
	
	@Test
	public void testGetImporte() throws Exception {
		Vector<Asignatura> vectorAsignaturas = new Vector<Asignatura>(Arrays.asList(
				new AsignaturaInstance(100), new AsignaturaInstance(100), new AsignaturaInstance(100))
				);
		Matricula matriculaMock = mock(Matricula.class);
		matriculaMock.vectorAsignaturas = vectorAsignaturas;
		matriculaMock.getImporte();
		verify(matriculaMock, times(3)).getImporte();
	}
}
