import java.io.*;
import java.util.*;

public class AttackMonitor {
	private List<MonsterAttack> monsters;

	public AttackMonitor() {
		monsters = new ArrayList<MonsterAttack>();
	}

	public void showAttacks() {
		for (MonsterAttack m : monsters) {
			System.out.println(m.attackList());
		}
	}

	public void readFile() throws IOException {
		try {
			System.out.println("Enter a filepath");
			Scanner in = new Scanner(System.in);
			File inFile = new File(in.next());
			Scanner reader = new Scanner(inFile);

			reader.nextLine();

			String line;
			String[] fields;
			int attack;
			int day;
			int month;
			int year;
			String name;
			String location;
			int victims;

			while (reader.hasNextLine()) {
				line = reader.nextLine();
				fields = line.split(",");
				attack = (int) Double.parseDouble(fields[0]);
				day = (int) Double.parseDouble(fields[1]);
				month = (int) Double.parseDouble(fields[2]);
				year = (int) Double.parseDouble(fields[3]);
				name = fields[4];
				victims = (int) Double.parseDouble(fields[5]);
				location = fields[6];
				monsters.add(new MonsterAttack(attack, day, month, year, name, victims, location));
			}
			reader.close();
			in.close();
		} catch (IOException e) {
			System.err.println(e);
			System.exit(1);
		}
	}
}