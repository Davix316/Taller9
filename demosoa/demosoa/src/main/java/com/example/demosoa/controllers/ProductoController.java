package com.example.demosoa.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demosoa.models.Producto;
import com.example.demosoa.services.ProductoService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/productos")
public class ProductoController {
	
	@Autowired
	private ProductoService productoservice;

	@GetMapping
	public List<Producto> findAll(){
		return productoservice.findall();
	}
	
	@PostMapping
	public Producto create ( @RequestBody Producto c) {
		return productoservice.create(c);
	}
	
	
		
	@GetMapping("/{id}")
	public  Producto findById (@PathVariable("id") Integer id) {
		return productoservice.findById(id);
	}
	
	
	@PutMapping ("/{id}")
	public Producto update ( @RequestBody Producto c, @PathVariable("id") Integer id) {
		c.setIdProducto(id);
		return productoservice.update(c);
	}
	
	
	@DeleteMapping ("/{IdProducto}")
	public void delete (@PathVariable("IdProducto") Integer IdProducto) {
		productoservice.delete(IdProducto);
	}
	
}