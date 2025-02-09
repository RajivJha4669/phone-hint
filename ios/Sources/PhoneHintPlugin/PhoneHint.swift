import Foundation

@objc public class PhoneHint: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
