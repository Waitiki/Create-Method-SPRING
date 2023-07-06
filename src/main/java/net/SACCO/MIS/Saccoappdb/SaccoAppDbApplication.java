package net.SACCO.MIS.Saccoappdb;

import net.SACCO.MIS.Saccoappdb.entity.expenses;
import net.SACCO.MIS.Saccoappdb.repository.expensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SaccoAppDbApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SaccoAppDbApplication.class, args);
	}

	@Autowired
	private expensesRepository ExpensesRepository;

	@Override
	public void run(String... args) throws Exception {

		expenses expenses1 = expenses.builder()
				.vendor("Boda-boda")
				.expense("cheque-delivery")
				.refNo(2222222)
				.amount(200)
				.build();

		expenses expenses2 = expenses.builder()
				.vendor("Njemu-Enterprises")
				.expense("stationery")
				.refNo(2122)
				.amount(500)
				.build();

		expenses expenses3 = expenses.builder()
				.vendor("Shaky-Enterprises")
				.expense("general-cleaning")
				.refNo(233222)
				.amount(1000)
				.build();

		ExpensesRepository.save(expenses1);
		ExpensesRepository.save(expenses2);
		ExpensesRepository.save(expenses3);




	}
}
