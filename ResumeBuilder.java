import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ResumeBuilder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Gather user information including the image file path
        System.out.println("Welcome to the Resume Builder!");
        System.out.print("Enter the file path of your profile picture (e.g., C:\\path\\to\\profile-pic.jpg): ");
        String profilePicturePath = scanner.nextLine();

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter your contact number: ");
        String contactNumber = scanner.nextLine();

        System.out.print("Enter your email address: ");
        String emailAddress = scanner.nextLine();

        System.out.print("Enter your GitHub profile: ");
        String gitHub = scanner.nextLine();

        System.out.print("Enter your LinkedIn profile: ");
        String linkedIn = scanner.nextLine();

        System.out.print("Enter your HackerRank profile: ");
        String hackerRank = scanner.nextLine();

        System.out.print("Enter your CodeChef profile: ");
        String codeChef = scanner.nextLine();

        System.out.print("Enter your LeetCode profile: ");
        String leetCode = scanner.nextLine();

        System.out.print("Enter your InterviewBit profile: ");
        String interviewBit = scanner.nextLine();

        System.out.println("Enter your education details:");
        System.out.print("School: ");
        String school = scanner.nextLine();

        System.out.print("Intermediate: ");
        String intermediate = scanner.nextLine();

        System.out.print("B.Tech: ");
        String bTech = scanner.nextLine();

        System.out.print("Enter your work experience: ");
        String workExperience = scanner.nextLine();

        System.out.print("Enter your certifications: ");
        String certifications = scanner.nextLine();

        System.out.print("Enter your achievements: ");
        String achievements = scanner.nextLine();

        System.out.print("Enter your projects: ");
        String projects = scanner.nextLine();

        System.out.print("Enter your skills: ");
        String skills = scanner.nextLine();

        System.out.print("Enter a summary about yourself: ");
        String summary = scanner.nextLine();

        System.out.print("Enter additional personal details: ");
        String additionalDetails = scanner.nextLine();

        // Generate and save the HTML resume with the profile picture
        String htmlResumeContent = generateHTMLResume(
                fullName, contactNumber, emailAddress, gitHub, linkedIn,
                hackerRank, codeChef, leetCode, interviewBit,
                school, intermediate, bTech,
                workExperience, certifications, achievements,
                projects, skills, summary, additionalDetails, profilePicturePath);

        saveResumeToFile(htmlResumeContent, "resume.html");
        System.out.println("Your HTML resume has been generated and saved to 'resume.html'.");

        // Generate and save the text resume
        String textResumeContent = generateTextResume(
                fullName, contactNumber, emailAddress, gitHub, linkedIn,
                hackerRank, codeChef, leetCode, interviewBit,
                school, intermediate, bTech,
                workExperience, certifications, achievements,
                projects, skills, summary, additionalDetails);

        saveResumeToFile(textResumeContent, "resume.txt");
        System.out.println("Your text resume has been generated and saved to 'resume.txt'.");
    }

    private static String generateHTMLResume(String fullName, String contactNumber, String emailAddress,
                                             String gitHub, String linkedIn,
                                             String hackerRank, String codeChef, String leetCode, String interviewBit,
                                             String school, String intermediate, String bTech,
                                             String workExperience, String certifications, String achievements,
                                             String projects, String skills, String summary, String additionalDetails,
                                             String profilePicturePath) {
        StringBuilder resumeBuilder = new StringBuilder();

        // HTML document structure
        resumeBuilder.append("<!DOCTYPE html>\n");
        resumeBuilder.append("<html lang=\"en\">\n");
        resumeBuilder.append("<head>\n");
        resumeBuilder.append("    <meta charset=\"UTF-8\">\n");
        resumeBuilder.append("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
        resumeBuilder.append("    <title>Resume</title>\n");

        // CSS styling for better presentation
     resumeBuilder.append("    <style>\n");
resumeBuilder.append("        body {\n");
resumeBuilder.append("            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\n");
resumeBuilder.append("            line-height: 1.6;\n");
resumeBuilder.append("            margin: 20px;\n");
resumeBuilder.append("            color: #333; /* Dark text color */\n");
resumeBuilder.append("            display: flex;\n");
resumeBuilder.append("            justify-content: space-between;\n");
resumeBuilder.append("        }\n");
resumeBuilder.append("        .column {\n");
resumeBuilder.append("            flex: 0 0 48%; /* Each column takes up 48% of the container */\n");
resumeBuilder.append("        }\n");
resumeBuilder.append("        .section {\n");
resumeBuilder.append("            margin-bottom: 30px;\n");
resumeBuilder.append("            padding: 20px;\n");
resumeBuilder.append("            border: 1px solid #e0e0e0;\n");
resumeBuilder.append("            border-radius: 8px;\n");
resumeBuilder.append("            background-color: #f5f5f5;\n");
resumeBuilder.append("        }\n");
resumeBuilder.append("        h2 {\n");
resumeBuilder.append("            color: #1565c0; /* Dark Blue color for the text */\n");
resumeBuilder.append("            font-family: 'Trebuchet MS', sans-serif;\n");
resumeBuilder.append("            padding: 5px; /* Add padding for spacing inside the heading border */\n");
resumeBuilder.append("            background-color: #d3d3d3; /* Lighter ash color for the background */\n");
resumeBuilder.append("            display: inline-block; /* Make the background surround the text only */\n");
resumeBuilder.append("            margin-bottom: 15px; /* Increase margin at the bottom for spacing */\n");
resumeBuilder.append("            border-radius: 15px; /* Add rounded corners to the heading background */\n");
resumeBuilder.append("            box-shadow: 50px 50px 50px #d3d3d3; /* Add a subtle box shadow for depth with the same ash color */\n");
resumeBuilder.append("        }\n");
resumeBuilder.append("        p {\n");
resumeBuilder.append("            margin-bottom: 10px;\n");
resumeBuilder.append("        }\n");
resumeBuilder.append("        .section-divider {\n");
resumeBuilder.append("            border-top: 2px solid #1565c0;\n");
resumeBuilder.append("            margin-top: 10px;\n");
resumeBuilder.append("            margin-bottom: 15px;\n");
resumeBuilder.append("        }\n");
resumeBuilder.append("    </style>\n");







        resumeBuilder.append("</head>\n");
        resumeBuilder.append("<body>\n");

        // Columns for layout
        resumeBuilder.append("    <div class=\"column\">\n");

        // Include the profile picture in the HTML
        // Include the rounded profile picture in the HTML
// Include the rounded profile picture in the HTML
resumeBuilder.append("        <img src=\"").append(profilePicturePath).append("\" alt=\"Profile Picture\" style=\"max-width: 100%; border-radius: 50%; width: 250px; height: 250px; border: 10px solid #fff; box-shadow: 0 0 10px rgba(0, 0, 0, 0.5); margin-left: 80px;\"> <!-- Added margin-left: 20px; -->\n");


        // ... (rest of the HTML generation remains unchanged)

    // Personal Information section
    resumeBuilder.append("        <div class=\"section\">\n");
    resumeBuilder.append("            <h2>Personal Information</h2>\n");
    resumeBuilder.append("            <p><strong>Name:</strong> ").append(fullName).append("</p>\n");
    resumeBuilder.append("            <hr class=\"section-divider\">\n");
    resumeBuilder.append("            <p><strong>Contact:</strong> ").append(contactNumber).append("</p>\n");
    resumeBuilder.append("            <hr class=\"section-divider\">\n");
    resumeBuilder.append("            <p><strong>Email:</strong> ").append(emailAddress).append("</p>\n");
    resumeBuilder.append("            <hr class=\"section-divider\">\n");
    resumeBuilder.append("            <p><strong>GitHub:</strong> ").append(gitHub).append("</p>\n");
    resumeBuilder.append("            <hr class=\"section-divider\">\n");
    resumeBuilder.append("            <p><strong>LinkedIn:</strong> ").append(linkedIn).append("</p>\n");
    resumeBuilder.append("            <hr class=\"section-divider\">\n");
    resumeBuilder.append("        </div>\n");

    // Coding Profiles section
    resumeBuilder.append("        <div class=\"section\">\n");
    resumeBuilder.append("            <h2>Coding Profiles</h2>\n");
    resumeBuilder.append("            <p><strong>HackerRank:</strong> ").append(hackerRank).append("</p>\n");
    resumeBuilder.append("            <hr class=\"section-divider\">\n");
    resumeBuilder.append("            <p><strong>CodeChef:</strong> ").append(codeChef).append("</p>\n");
    resumeBuilder.append("            <hr class=\"section-divider\">\n");
    resumeBuilder.append("            <p><strong>LeetCode:</strong> ").append(leetCode).append("</p>\n");
    resumeBuilder.append("            <hr class=\"section-divider\">\n");
    resumeBuilder.append("            <p><strong>InterviewBit:</strong> ").append(interviewBit).append("</p>\n");
    resumeBuilder.append("            <hr class=\"section-divider\">\n");
    resumeBuilder.append("        </div>\n");

    // Education section
    resumeBuilder.append("        <div class=\"section\">\n");
    resumeBuilder.append("            <h2>Education</h2>\n");
    resumeBuilder.append("            <p><strong>School:</strong> ").append(school).append("</p>\n");
    resumeBuilder.append("            <hr class=\"section-divider\">\n");
    resumeBuilder.append("            <p><strong>Intermediate:</strong> ").append(intermediate).append("</p>\n");
    resumeBuilder.append("            <hr class=\"section-divider\">\n");
    resumeBuilder.append("            <p><strong>B.Tech:</strong> ").append(bTech).append("</p>\n");
    resumeBuilder.append("            <hr class=\"section-divider\">\n");
    resumeBuilder.append("        </div>\n");

    resumeBuilder.append("    </div>\n");

    // Right column
    resumeBuilder.append("    <div class=\"column\">\n");

    // Work Experience section
    resumeBuilder.append("        <div class=\"section\">\n");
    resumeBuilder.append("            <h2>Work Experience</h2>\n");
    resumeBuilder.append("            <p>").append(workExperience).append("</p>\n");
    resumeBuilder.append("            <hr class=\"section-divider\">\n");
    resumeBuilder.append("        </div>\n");

    // Certifications section
    resumeBuilder.append("        <div class=\"section\">\n");
    resumeBuilder.append("            <h2>Certifications</h2>\n");
    resumeBuilder.append("            <p>").append(certifications).append("</p>\n");
    resumeBuilder.append("            <hr class=\"section-divider\">\n");
    resumeBuilder.append("        </div>\n");

    // Achievements section
    resumeBuilder.append("        <div class=\"section\">\n");
    resumeBuilder.append("            <h2>Achievements</h2>\n");
    resumeBuilder.append("            <p>").append(achievements).append("</p>\n");
    resumeBuilder.append("            <hr class=\"section-divider\">\n");
    resumeBuilder.append("        </div>\n");

    // Projects section
    resumeBuilder.append("        <div class=\"section\">\n");
    resumeBuilder.append("            <h2>Projects</h2>\n");
    resumeBuilder.append("            <p>").append(projects).append("</p>\n");
    resumeBuilder.append("            <hr class=\"section-divider\">\n");
    resumeBuilder.append("        </div>\n");

    // Skills section
    resumeBuilder.append("        <div class=\"section\">\n");
    resumeBuilder.append("            <h2>Skills</h2>\n");
    resumeBuilder.append("            <p>").append(skills).append("</p>\n");
    resumeBuilder.append("            <hr class=\"section-divider\">\n");
    resumeBuilder.append("        </div>\n");

    // Summary section
    resumeBuilder.append("        <div class=\"section\">\n");
    resumeBuilder.append("            <h2>Summary</h2>\n");
    resumeBuilder.append("            <p>").append(summary).append("</p>\n");
    resumeBuilder.append("            <hr class=\"section-divider\">\n");
    resumeBuilder.append("        </div>\n");

    // Additional Personal Details section
    resumeBuilder.append("        <div class=\"section\">\n");
    resumeBuilder.append("            <h2>Additional Personal Details</h2>\n");
    resumeBuilder.append("            <p>").append(additionalDetails).append("</p>\n");
    resumeBuilder.append("            <hr class=\"section-divider\">\n");
    resumeBuilder.append("        </div>\n");

    resumeBuilder.append("    </div>\n");

    // Closing HTML tags
    resumeBuilder.append("</body>\n");
    resumeBuilder.append("</html>\n");

    return resumeBuilder.toString();
}


private static String generateTextResume(String fullName, String contactNumber, String emailAddress,
                                         String gitHub, String linkedIn,
                                         String hackerRank, String codeChef, String leetCode, String interviewBit,
                                         String school, String intermediate, String bTech,
                                         String workExperience, String certifications, String achievements,
                                         String projects, String skills, String summary, String additionalDetails) {
    StringBuilder resumeBuilder = new StringBuilder();

    // Text document structure
    resumeBuilder.append("Resume\n\n");

    // Personal Information section
    resumeBuilder.append("Personal Information\n");
    resumeBuilder.append("Name: ").append(fullName).append("\n");
    resumeBuilder.append("Contact: ").append(contactNumber).append("\n");
    resumeBuilder.append("Email: ").append(emailAddress).append("\n");
    resumeBuilder.append("GitHub: ").append(gitHub).append("\n");
    resumeBuilder.append("LinkedIn: ").append(linkedIn).append("\n\n");

    // Coding Profiles section
    resumeBuilder.append("Coding Profiles\n");
    resumeBuilder.append("HackerRank: ").append(hackerRank).append("\n");
    resumeBuilder.append("CodeChef: ").append(codeChef).append("\n");
    resumeBuilder.append("LeetCode: ").append(leetCode).append("\n");
    resumeBuilder.append("InterviewBit: ").append(interviewBit).append("\n\n");

    // Education section
    resumeBuilder.append("Education\n");
    resumeBuilder.append("School: ").append(school).append("\n");
    resumeBuilder.append("Intermediate: ").append(intermediate).append("\n");
    resumeBuilder.append("B.Tech: ").append(bTech).append("\n\n");

    // Work Experience section
    resumeBuilder.append("Work Experience\n");
    resumeBuilder.append(workExperience).append("\n\n");

    // Certifications section
    resumeBuilder.append("Certifications\n");
    resumeBuilder.append(certifications).append("\n\n");

    // Achievements section
    resumeBuilder.append("Achievements\n");
    resumeBuilder.append(achievements).append("\n\n");

    // Projects section
    resumeBuilder.append("Projects\n");
    resumeBuilder.append(projects).append("\n\n");

    // Skills section
    resumeBuilder.append("Skills\n");
    resumeBuilder.append(skills).append("\n\n");

    // Summary section
    resumeBuilder.append("Summary\n");
    resumeBuilder.append(summary).append("\n\n");

    // Additional Personal Details section
    resumeBuilder.append("Additional Personal Details\n");
    resumeBuilder.append(additionalDetails).append("\n\n");

    return resumeBuilder.toString();
}


    private static void saveResumeToFile(String content, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
        } catch (IOException e) {
            System.err.println("An error occurred while saving the resume to file: " + e.getMessage());
        }
    }
}
