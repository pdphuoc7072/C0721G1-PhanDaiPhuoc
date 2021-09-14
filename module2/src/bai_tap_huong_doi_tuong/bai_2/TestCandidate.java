package bai_tap_huong_doi_tuong.bai_2;

import java.util.Scanner;

public class TestCandidate {
    public static void main(String[] args) {
        CandidateManager candidate = new CandidateManager();
        candidate.addCandidate();
        candidate.displayCandidateOfTotalScore15();
    }
}
