package bai_tap_huong_doi_tuong.bai_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidateManager {
    List<Candidate> candidateList = new ArrayList<>();
    public void addCandidate () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập số thí sinh bạn muốn nhập: ");
        int numberOfCandidate = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfCandidate; i++) {
            int id = i+1;
            System.out.print("Hãy nhập họ và tên của thí sinh thứ " + (i+1) + ": " );
            String fullName = scanner.nextLine();
            System.out.print("Hãy nhập ngày tháng năm sinh của thí sinh: ");
            String birthday = scanner.nextLine();
            System.out.print("Hãy nhập điểm số môn Toán: ");
            double scoreOfMath = Double.parseDouble(scanner.nextLine());
            System.out.print("Hãy nhập điểm số môn Ngữ Văn: ");
            double scoreOFLiterature = Double.parseDouble(scanner.nextLine());
            System.out.print("Hãy nhập điểm số môn tiếng Anh: ");
            double scoreOfEnglish = Double.parseDouble(scanner.nextLine());
            candidateList.add(new Candidate(id, fullName, birthday, scoreOfMath, scoreOFLiterature, scoreOfEnglish));
        }
    }
    public void displayCandidateOfTotalScore15 () {
        System.out.println("Những thí sinh có tổng điểm 3 môn lớn hơn 15 là: ");
        for (Candidate candidate : candidateList) {
            if (candidate.getScoreOfMath() + candidate.getScoreOFLiterature() + candidate.getScoreOfEnglish() > 15) {
                System.out.println(candidate.toString());
            }
        }
    }
}
